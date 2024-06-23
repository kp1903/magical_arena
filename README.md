# Magical Arena

## Overview
This project simulates a magical arena where two players fight until one player's health reaches zero.

## How to Run
1. Clone the repository.
2. Navigate to the src directory.
3. Compile the source code:
    bash
    javac Main.java
    
4. Run the main script:
    bash
    java Main
    

## Running Tests
1. Ensure you have JUnit 5 in your classpath.
2. Navigate to the test directory.
3. Run the tests:
    bash
    javac -cp .:path_to_junit5.jar PlayerTest.java ArenaTest.java
    java -cp .:path_to_junit5.jar org.junit.platform.console.ConsoleLauncher --scan-classpath
    

## Project Structure
- src/Player.java: Contains the Player class.
- src/Arena.java: Contains the Arena class.
- src/Main.java: Main script to run the game.
- test/PlayerTest.java: Unit tests for the Player class.
- test/ArenaTest.java: Unit tests for the Arena class.

## Design Decisions
- Players attack and defend using a random roll of a six-sided die.
- The player with lower health attacks first in each round.
- The game ends when a player's health reaches zero.