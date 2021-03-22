package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    private final int argOne;
    private final int argTwo;

    public Multiply(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }


    @NonNull
    @Override
    public String toString() {
        return "" + (argOne * argTwo);
    }
}
