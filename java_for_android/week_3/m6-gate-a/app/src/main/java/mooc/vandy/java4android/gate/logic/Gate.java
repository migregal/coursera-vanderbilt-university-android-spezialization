package mooc.vandy.java4android.gate.logic;

import androidx.annotation.NonNull;

/**
 * This file defines the Gate class.
 */
public class Gate {
    private int mSwing;

    public static final int OUT = -1;
    public static final int IN = 1;
    public static final int CLOSED = 0;

    Gate() {
        mSwing = CLOSED;
    }

    boolean setSwing(int direction) {
        if (direction != OUT && direction != IN && direction != CLOSED)
            return false;

        mSwing = direction;
        return true;
    }

    int getSwingDirection() {
        return mSwing;
    }

    boolean open(int direction) {
        if (direction != OUT && direction != IN)
            return false;

        return setSwing(direction);
    }

    void close() {
        mSwing = CLOSED;
    }

    int thru(int count) {
        switch (mSwing) {
            case IN:
                return count;
            case OUT:
                return -count;
            default:
                return 0;
        }
    }

    @NonNull
    @Override
    public String toString() {
        switch (mSwing) {
            case IN:
                return "This gate is open and swings to enter the pen only";
            case OUT:
                return "This gate is open and swings to exit the pen only";
            case CLOSED:
                return "This gate is closed";
            default:
                return "This gate has an invalid swing direction";
        }
    }
}
