package Penis.HW;

public class PickingCards {
    //Write a program that simulates the action of picking a card from a deck of 52 cards. Your program displays the suit and rank of the card.
    public static void main(String[] args) {
        int a, b;
        a = (int)(Math.random() * 13);
        b = (int)(Math.random() * 4);
        String[] card = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};

        System.out.println("The card is " + card[a] + " of " + suit[b]);

    }
}
