package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    private String mOwner = null;
    private boolean mPool = false;

    House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }

    String getOwner() {
        return mOwner;
    }

    boolean hasPool() {
        return mPool;
    }

    void setOwner(String owner) {
        mOwner = owner;
    }

    void setPool(boolean pool) {
        mPool = pool;
    }

    @NonNull
    @Override
    public String toString() {
        String res = "Owner: ";

        res += mOwner == null ? "n/a" : mOwner;

        if (hasPool())
            res += "; has a pool";

        if (calcLotArea() >= 2 * calcBuildingArea())
            res += "; has a big open space";

        return res;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        House other = (House) obj;

        return mPool == other.mPool && calcBuildingArea() == other.calcBuildingArea();
    }
}
