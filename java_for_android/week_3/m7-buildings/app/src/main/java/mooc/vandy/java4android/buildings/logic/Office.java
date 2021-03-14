package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
    private static int sTotalOffices = 0;

    private String mBusinessName = null;
    private int mParkingSpaces = 0;

    Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices += 1;
    }

    Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }

    Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    static int getTotalOffices() {
        return sTotalOffices;
    }

    String getBusinessName() {
        return mBusinessName;
    }

    int getParkingSpaces() {
        return mParkingSpaces;
    }

    void setBusinessName(String businessName) {
        mBusinessName = businessName;
    }

    void setParkingSpaces(int parkingSpaces) {
        mParkingSpaces = parkingSpaces;
    }

    @NonNull
    @Override
    public String toString() {
        String res = "Business: ";

        res += mBusinessName == null ? "unoccupied" : mBusinessName;

        if (mParkingSpaces != 0)
            res += "; has " + mParkingSpaces + " parking spaces";

        res += " (total offices: " + sTotalOffices + ")";
        return res;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Office other = (Office) obj;

        return calcBuildingArea() == other.calcBuildingArea() && mParkingSpaces == other.mParkingSpaces;
    }
}
