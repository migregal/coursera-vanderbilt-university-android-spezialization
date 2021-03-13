package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private final OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    public void setCorralGates(Gate[] gate, Random selectDirection) {
        mOut.println("Initial gate setup:");

        for (int i = 0; i < gate.length; i++) {
            gate[i].setSwing(selectDirection.nextInt(3) - 1);
            mOut.println("Gate " + i + ": " + gate[i].toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for (Gate gate : corral) {
            if (gate.getSwingDirection() == Gate.IN)
                return true;
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand) {
        int pasture = 5, attemptCount = 0;
        int randomNumber, randomGate;

        do {
            randomGate = rand.nextInt(corral.length);
            randomNumber = rand.nextInt(pasture) + 1;
            mOut.println(randomNumber + " are trying to move through corral " + randomGate);
            pasture -= corral[randomGate].thru(randomNumber);
            attemptCount++;
        } while (pasture > 0);

        mOut.println("It took " + attemptCount + " attempts to corral all of the snails.");

        return attemptCount;
    }
}