package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {

    private boolean mSecondFloor = false;

    Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
    }

    Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        this(dimension, lotLength, lotWidth);
        mSecondFloor = secondFloor;
    }

    boolean hasSecondFloor() {
        return mSecondFloor;
    }

    @NonNull
    @Override
    public String toString() {
        String res = super.toString();

        if (hasSecondFloor())
            return res + "; is a two story cottage";

        return res + "; is a cottage";
    }
}

