package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        int height = size * 2 + 1;
        int accumulator = -size;

        for (int i = 1; i <= height; i++)
            drawLine(size, i, accumulator++);
    }

    public void drawLine(int size, int cur_h, int accumulator) {
        int height = size * 2 + 1;
        int width = size * 2 + 2;

        for (int j = 1; j <= width; j++) {
            if ((cur_h == 1 || cur_h == height) && (j == 1 || j == width))
                mOut.print("+");
            else if (cur_h == 1 || cur_h == height)
                mOut.print("-");
            else if (j == 1 || j == width)
                mOut.print("|");
            else {
                drawDiamond(size, cur_h, j, accumulator);
            }
        }
        mOut.print("\n");
    }

    public void drawDiamond(int size, int i, int j, int accumulator) {
        int diamondRowThickness;
        if (accumulator <= 0)
            diamondRowThickness = (i - 1) * 2;
        else
            diamondRowThickness = (i - 1 - accumulator * 2) * 2;

        int diamondMidpoint = size + 1;
        int diamondBoundsLeft = diamondMidpoint - (diamondRowThickness / 2 - 1);
        int diamondBoundsRight = diamondMidpoint + (diamondRowThickness / 2);
        int frameTop = 1, frameBottom = size * 2 + 1;

        if (j < diamondBoundsLeft || j > diamondBoundsRight) {
            mOut.print(" ");
            return;
        }

        if (j != diamondBoundsLeft && j != diamondBoundsRight) {
            if (i % 2 == 0)
                mOut.print("=");
            else
                mOut.print("-");

            return;
        }

        if (i < diamondMidpoint && i > frameTop) {
            if (j == diamondBoundsLeft)
                mOut.print("/");
            else
                mOut.print("\\");

            return;
        }

        if (i == diamondMidpoint) {
            if (j == diamondBoundsLeft)
                mOut.print("<");
            else
                mOut.print(">");

            return;
        }

        if (i > diamondMidpoint && i < frameBottom) {
            if (j == diamondBoundsLeft)
                mOut.print("\\");
            else
                mOut.print("/");
        }
    }
}
