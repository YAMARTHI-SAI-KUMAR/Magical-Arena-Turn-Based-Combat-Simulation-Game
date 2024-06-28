package com.game_battle;




class Player {
    private int health;
    private final int strength;
    private final int attack;

    Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int rollAttackDice(int dice) {
        return attack * dice;
    }

    public int rollDefendDice(int dice) {
        return strength * dice;
    }


}

