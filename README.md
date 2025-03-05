# Suites

## Overview
Suites is a command-line Java application that simulates a deck of playing cards, allowing users to perform a variety of card operations. Developed as an assignment for the AIML-B1 class, this project demonstrates essential Java programming concepts including object-oriented design, control structures, and user interaction through a menu-driven interface.

## Features
- **Display Full Deck:** Print the complete deck of 52 cards.
- **Display Specific Card:** Retrieve and display a card based on its index in the deck.
- **Suit Comparison:** Determine if two selected cards belong to the same suit.
- **Rank Comparison:** Check if two selected cards share the same rank.
- **Card Search:** Find a specific card by entering its rank and suit.
- **Deal Cards:** Shuffle the deck and deal 5 random cards.
- **Shuffle Deck:** Randomize the order of the deck.
- **Interactive Menu:** User-friendly menu for navigating the various card operations.

## Project Structure
Suites/ 
├── Main.java 
├── Card.java 
└── Deck.java

- **Main.java:** Contains the main method which drives the application and handles user input via a menu.
- **Card.java:** Defines the `Card` class, representing a playing card with properties for rank and suit, and includes methods for comparing cards.
- **Deck.java:** Implements the `Deck` class, responsible for initializing a full deck of cards, shuffling, and executing various card-related operations.

## Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8** or later
- A command-line interface (Terminal, Command Prompt, etc.)

### Installation and Execution

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/eesha-barad/Suites.git
   ```
2. **Navigate to the Project Directory:**
   ```sh
   cd Suites
   ```
3. **Compile the Java Source Files:**
   ```sh
   javac Main.java
   ```
4. **Run the Application:**
   ```sh
   java Main
   ```
### Usage

**Print Deck:** Displays all the cards in the deck.
**Print Specific Card:** Enter the index of the card to view its details.
**Check Same Suit:** Provide the indices of two cards to verify if they share the same suit.
**Compare Card Rank:** Compare the ranks of two cards by entering their indices.
**Find a Card:** Input a card's rank and suit to search for it within the deck.
**Deal 5 Cards:** The application shuffles the deck and deals 5 random cards.
**Shuffle Deck:** Randomizes the order of the deck.
**Exit:** Terminates the application.
