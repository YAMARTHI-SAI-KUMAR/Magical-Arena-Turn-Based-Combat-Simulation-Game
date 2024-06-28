package com.game_battle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test // Import all assertion methods
    void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }

    @Test
    void testRollAttackDice() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.rollAttackDice(5)); // 10 * 5 = 50
    }

    @Test
    void testRollDefendDice() {
        Player player = new Player(50, 5, 10);
        assertEquals(25, player.rollDefendDice(5)); // 5 * 5 = 25
    }
}
