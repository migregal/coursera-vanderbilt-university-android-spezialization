package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Divide operation.
 */
public class Divide {
    private final int mArgumentOne;
    private final int mArgumentTwo;

    public Divide(int argumentOne, int argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    @NonNull
    @Override
    public String toString() {
        return "" + mArgumentOne / mArgumentTwo + " R:" + mArgumentOne % mArgumentTwo;
    }
}
