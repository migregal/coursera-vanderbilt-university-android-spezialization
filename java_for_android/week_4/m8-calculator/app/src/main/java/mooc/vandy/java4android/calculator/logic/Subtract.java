package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    private final int argOne;
    private final int argTwo;

    public Subtract(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    @NonNull
    @Override
    public String toString() {
        return "" + (argOne - argTwo);
    }
}
