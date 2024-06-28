package com.game_battle;



import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class ScannerWrapperTest {

    @Test
    void testNextInt() {
        // Provide input to the Scanner
        String input = "42";
        Scanner scanner = new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));
        ScannerWrapper scannerWrapper = new ScannerWrapper(scanner);

        // Assert that the ScannerWrapper correctly reads the integer
        assertEquals(42, scannerWrapper.nextInt());
    }

    @Test
    void testNextIntMultipleValues() {
        // Provide multiple inputs to the Scanner
        String input = "42 100";
        Scanner scanner = new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));
        ScannerWrapper scannerWrapper = new ScannerWrapper(scanner);

        // Assert that the ScannerWrapper correctly reads the integers
        assertEquals(42, scannerWrapper.nextInt());
        assertEquals(100, scannerWrapper.nextInt());
    }

    @Test
    void testNextIntNegativeValue() {
        // Provide a negative input to the Scanner
        String input = "-42";
        Scanner scanner = new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));
        ScannerWrapper scannerWrapper = new ScannerWrapper(scanner);

        // Assert that the ScannerWrapper correctly reads the negative integer
        assertEquals(-42, scannerWrapper.nextInt());
    }

    @Test
    void testNextIntZero() {
        // Provide zero as input to the Scanner
        String input = "0";
        Scanner scanner = new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));
        ScannerWrapper scannerWrapper = new ScannerWrapper(scanner);

        // Assert that the ScannerWrapper correctly reads zero
        assertEquals(0, scannerWrapper.nextInt());
    }
}
