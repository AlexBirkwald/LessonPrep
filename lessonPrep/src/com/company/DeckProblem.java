package com.company;

public class DeckProblem {

    int [] deckOfCards = new int[52];

    public void shuffleAndDrawCards(){
        assignDeck();
        deckOfCards = shuffleDeck(deckOfCards);

        for(int i = 0; i < 4; i++){
            printCard(deckOfCards[i]);
        }
    }



    private void assignDeck(){
        for(int i = 0; i < deckOfCards.length; i++){
            deckOfCards[i] = i;
        }
    }



    private int[] shuffleDeck(int[] array){
        for(int i = 0; i < array.length; i++){
            int j = (int) (Math.random() * array.length);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }



    private String defineSuit(int cardNumber){

        int suit = cardNumber / 13;

        switch (suit){
            case 0:
                return "Spades";

            case 1:
                return "Hearts";

            case 2:
                return "Diamonds";

            case 3:
                return "Clubs";

            default:
                System.out.println(cardNumber);
                return "unknown";
        }
    }



    private int defineCardNumber(int cardNumber){
        int output = 0;

        output = cardNumber % 13;

        return output;
    }



    private void printCard(int cardNumber){
        String suit = defineSuit(cardNumber);
        int card = defineCardNumber(cardNumber);

        switch (card){
            case 11:
                System.out.println("Jack of " + suit);
                break;

            case 12:
                System.out.println("Queen of " + suit);
                break;

            case 13:
                System.out.println("King of " + suit);
                break;

            case 0:
                System.out.println("Ace of " + suit);

            default:
                System.out.println(card + " of " + suit);
        }

    }

}
