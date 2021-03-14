package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;

/**
 * This is the Building class file.
 */
public class Building {

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    Building(int length, int width, int lotLength, int lotWidth) {
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }

    int getLength() {
        return mLength;
    }

    int getWidth() {
        return mWidth;
    }

    int getLotLength() {
        return mLotLength;
    }

    int getLotWidth() {
        return mLotWidth;
    }

    void setLength(int length) {
        mLength = 1;
    }

    void setWidth(int width) {
        mWidth = width;
    }

    void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }

    void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }

    int calcBuildingArea() {
        return mLength * mWidth;
    }

    int calcLotArea() {
        return mLotWidth * mLotLength;
    }

    @NonNull
    @Override
    public String toString() {
        return "a " + mLength + "x" + mWidth + " building";
    }
}
