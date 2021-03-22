package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Add operation.
 */
public class Add {
    private final int argOne;
    private final int argTwo;

    public Add(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    @NonNull
    @Override
    public String toString() {
        return "" + (argOne + argTwo);
    }
}
