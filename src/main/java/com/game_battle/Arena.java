package com.game_battle;



import java.util.logging.Logger;
import java.util.logging.Level;

class Arena {
    private static final Logger LOGGER = Logger.getLogger(Arena.class.getName());
    private final Player player1;
    private final Player player2;
    private final Dice dice;


    Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();


    }

    public void startBattle() {
        Player attacker;
        Player defender;
        attacker = (player1.getHealth() >= player2.getHealth()) ? player2 : player1;
        
        defender = (attacker == player2) ? player1 : player2;
        while (player1.isAlive() && player2.isAlive()) {
            takeTurn(attacker, defender);

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        if (player1.isAlive()) {
            LOGGER.log(Level.INFO, "Player1 wins!");
        } 
        else if(player2.isAlive()){
            LOGGER.log(Level.INFO, "Player2 wins!");
        }

        else{
            LOGGER.log(Level.INFO, "No Player wins!");

        }
    }

    private void takeTurn(Player attacker, Player defender) {
        int roll1 = dice.roll();
        int attackDamage = attacker.rollAttackDice(roll1);
        int roll2 = dice.roll();
        int defense = defender.rollDefendDice(roll2);
        int damage = attackDamage - defense;
        if (damage > 0) {
            defender.setHealth(defender.getHealth() - damage);
        }
        LOGGER.log(Level.INFO, "dice 1: {0}", roll1);
        LOGGER.log(Level.INFO, "dice 2: {0}", roll2);
        LOGGER.log(Level.INFO, "Attacker: {0} Defender: {1}", new Object[]{attacker, defender});
        LOGGER.log(Level.INFO, "Attack Damage: {0} Defense: {1} Damage: {2}", new Object[]{attackDamage, defense, damage});
        LOGGER.log(Level.INFO, "Damage dealt: {0}", Math.max(0, damage));
        LOGGER.log(Level.INFO, "Defender's remaining health: {0}", defender.getHealth());
        LOGGER.log(Level.INFO, "------------------------------------------------------");
    }
}
