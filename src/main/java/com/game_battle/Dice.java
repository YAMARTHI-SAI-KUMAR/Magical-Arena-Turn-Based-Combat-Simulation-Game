package com.game_battle;



import java.util.*;

class Dice{
  private Random randon;
  Dice(){
    this.randon = new Random();
  }
  public int roll(){
    return this.randon.nextInt(6)+1;

    //random number between 1 and 6 as it gets the random number between 0 and 5 so we add 1 to get the random number between 1 and 6
  }
  
  
}

