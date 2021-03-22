package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;


    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }


    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        switch (operation) {
            case ADDITION:
                mOut.print(new Add(argumentOne, argumentTwo).toString());
                break;
            case SUBTRACTION:
                mOut.print(new Subtract(argumentOne, argumentTwo).toString());
                break;
            case MULTIPLICATION:
                mOut.print(new Multiply(argumentOne, argumentTwo).toString());
                break;
            case DIVISION:
                mOut.print(new Divide(argumentOne, argumentTwo).toString());
                break;
            default:
                break;
        }
    }
}
