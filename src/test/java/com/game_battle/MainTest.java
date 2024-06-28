package com.game_battle;





import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MainTest {

    @Test
    void testMain() {
        // Create a mock IScanner
        IScanner mockScanner = Mockito.mock(IScanner.class);

        // Define the behavior of the mock IScanner
        when(mockScanner.nextInt())
                .thenReturn(100)  // Player one health
                .thenReturn(10)   // Player one strength
                .thenReturn(15)   // Player one attack
                .thenReturn(50)   // Player two health
                .thenReturn(5)    // Player two strength
                .thenReturn(8);   // Player two attack

        // Call the startBattle method with the mock IScanner
        Game.startBattle(mockScanner);

        // Verify that the Scanner was used to read six integers
        verify(mockScanner, times(6)).nextInt();
    }
}
