Here is the README file :

Magical Arena Game

#Summary

Two players, each characterized by traits like attack, strength, and health, engage in a turnbased combat simulation in the Magical Arena game. Players take turns attacking and
defending until one player's health drops to zero. The first to attack is the player with less
health. Dice are used to decide attack and defense outcomes.

## Project Structure

The project is organized as follows:
src/main/java/com/game_battle/
- Dice.java: Class representing a six-sided dice.
- IScanner.java: Interface for scanning input.
- Arena.java: Class that handles the game logic.
- Game.java: Entry point for the game.
- Player.java: Class representing a player with attributes.
- ScannerWrapper.java: Wrapper class for the scanner.

src/test/java/com/swiggy/
- DiceTest.java: Unit tests for the Dice class.
- ArenaTest.java: Unit tests for the MagicalArena class.
- GameTest.java: Unit tests for the Main class.
- PlayerTest.java: Unit tests for the Player class.
- ScannerWrapperTest.java: Unit tests for the ScannerWrapper class.

### Prerequisites

•Java 8 or higher
•Maven
•IDE like VSCode
•JUnit



#### How to Build and Run

 To import the project into Eclipse:
  1.Open Eclipse IDE.
  2.Select "File" -> "Import" -> "Existing Maven Projects".
  3.Browse to the project directory and select it.
  4.Click "Finish".



To import the project into VSCode:
 1.Open VSCode.
 2.Install the Maven extension for VSCode if not already installed.
 3.Open the project directory in VSCode.
 4.VSCode should automatically detect the Maven project and set it up.




##### How to Run

To run the game, follow these steps:


 • Run the Main.java file as a Java application to start the game.
   • In Eclipse: Right-click on Main.java class -> Run As -> Java Application.
   • In VSCode: Open Main.java -> Right-click -> Run Java.

###### How to Play

1.Two players are created with initial attributes (health, strength, and attack).
2.Players take turns attacking and defending.
3.The player with the least health starts the attack, and swaps happen one after another.
4.Each player rolls a 6-sided die for attack and defense.
5.Damage is calculated based on the dice rolls and player attributes.
6.The game continues until one player's health reaches zero.







######### Unit Tests
Unit tests are provided to ensure the correctness of the code. JUnit 4 and Mockito libraries
are used for testing.
Steps to Run Unit Tests:
1. In Visual Studio Code, navigate to the test class file (e.g.,
src/test/java/com/game_battle/DiceTest.java).
2. Right-click on the test class and select "Run Java".


