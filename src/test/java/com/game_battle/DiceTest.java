package com.game_battle;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void testDiceRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6); // Ensure roll is between 1 and 6
        }
    }
}
