package com.game_battle;


import java.util.Scanner;

public class ScannerWrapper implements IScanner {
    private final Scanner scanner;

    public ScannerWrapper(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }
}
