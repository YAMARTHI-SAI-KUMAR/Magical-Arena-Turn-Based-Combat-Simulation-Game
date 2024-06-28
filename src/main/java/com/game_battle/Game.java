package com.game_battle;

public class Game {

    public static void main(String[] args) {
        IScanner scanner = new ScannerWrapper(new java.util.Scanner(System.in));
        startBattle(scanner);
    }

    public static void startBattle(IScanner sc) {
        System.out.println("Enter player one health: ");
        int playerOneHealth = sc.nextInt();
        System.out.println("Enter player one strength: ");
        int playerOneStrength = sc.nextInt();
        System.out.println("Enter player one attack: ");
        int playerOneAttack = sc.nextInt();
        System.out.println("Enter player two health: ");
        int playerTwoHealth = sc.nextInt();
        System.out.println("Enter player two strength: ");
        int playerTwoStrength = sc.nextInt();
        System.out.println("Enter player two attack: ");
        int playerTwoAttack = sc.nextInt();

        Player playerA = new Player(playerOneHealth, playerOneStrength, playerOneAttack);
        Player playerB = new Player(playerTwoHealth, playerTwoStrength, playerTwoAttack);

        // Initialize the arena with the players
        Arena arena = new Arena(playerA, playerB);

        // Start the battle
        arena.startBattle();
    }
}
