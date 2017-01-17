package adrian.embid.blackjackapp;

/**
 * Created by AEmbid on 2017.
 */

public class Card {
    //clase simple, contiene palo, rango e imagen de la carta
    int suit;
    int rank;

    Card(int palo, int rango) {
        suit = palo;
        rank = rango;
    }

    public int get_suit() {
        return suit;
    }

    public int get_rank() {
        return rank;
    }

    public void get_img() {
        //TODO ADD METHOD TO DRAW
    }


}
