 // Deck.java

import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create and initialize deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 playing cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Print a specific card
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index! Card does not exist.");
        }
    }

    // Check if two cards belong to the same suit
    public void sameCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            if (deck.get(index1).sameSuit(deck.get(index2))) {
                System.out.println("The cards have the same suit.");
            } else {
                System.out.println("The cards have different suits.");
            }
        } else {
            System.out.println("Invalid indices!");
        }
    }
