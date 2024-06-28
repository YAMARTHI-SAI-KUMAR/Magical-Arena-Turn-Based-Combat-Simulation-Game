package com.game_battle;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Arena arena;
    private Arena arena2;

    @BeforeEach
    void setUp() {
        player1 = new Player(50, 5, 10);
        player2 = new Player(100, 10, 5);
        player3 = new Player(0, 5, 10);
        player4 = new Player(0, 10, 5);
        arena = new Arena(player1, player2);
        arena2 = new Arena(player3, player4);
    }

    @Test
    void testBattleInitialization() {
        assertEquals(50, player1.getHealth());
        assertEquals(5, player1.getStrength());
        assertEquals(10, player1.getAttack());

        assertEquals(100, player2.getHealth());
        assertEquals(10, player2.getStrength());
        assertEquals(5, player2.getAttack());

        assertEquals(0, player3.getHealth());
        assertEquals(5, player3.getStrength());
        assertEquals(10, player3.getAttack());

        assertEquals(0, player4.getHealth());
        assertEquals(10, player4.getStrength());
        assertEquals(5, player4.getAttack());
    }

    @Test
    void testBattleOutcome() {
        arena.startBattle();
        assertTrue(player1.isAlive() || player2.isAlive());
        assertFalse(player1.isAlive() && player2.isAlive());
    }

    @Test
    void testBothPlayersHealthZero() {
        player1 = new Player(0, 5, 10);
        player2 = new Player(0, 10, 5);
        arena = new Arena(player1, player2);

        assertEquals(0, player1.getHealth());
        assertEquals(0, player2.getHealth());

        arena.startBattle();

        assertFalse(player1.isAlive());
        assertFalse(player2.isAlive());
    }
    @Test
    void testPlayer1Wins() {
        player1 = new Player(50, 10, 10);  // Stronger player
        player2 = new Player(10, 5, 5);    // Weaker player
        arena = new Arena(player1, player2);

        arena.startBattle();

        assertTrue(player1.isAlive());
        assertFalse(player2.isAlive());
    }

    @Test
    void testPlayer2Wins() {
        player1 = new Player(10, 5, 5);    // Weaker player
        player2 = new Player(50, 10, 10);  // Stronger player
        arena = new Arena(player1, player2);

        arena.startBattle();

        assertFalse(player1.isAlive());
        assertTrue(player2.isAlive());
    }

    @Test
    void testArena2BattleInitialization() {
        assertEquals(0, player3.getHealth());
        assertEquals(5, player3.getStrength());
        assertEquals(10, player3.getAttack());

        assertEquals(0, player4.getHealth());
        assertEquals(10, player4.getStrength());
        assertEquals(5, player4.getAttack());

        arena2.startBattle();

        assertFalse(player3.isAlive());
        assertFalse(player4.isAlive());
    }
}
