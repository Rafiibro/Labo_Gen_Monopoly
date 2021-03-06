package dice;

import org.junit.jupiter.api.RepeatedTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private static final Logger LOG = Logger.getLogger(DiceTest.class.getName());

    @RepeatedTest(10)
    void RandomRollDice() {
        Dice dice = new Dice();
        dice.roll();
        LOG.info("Dice face value = " + dice.faceValue());
        assertTrue(dice.faceValue() < 7 && dice.faceValue() > 0);
    }
}