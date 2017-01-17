package adrian.embid.blackjackapp;

import java.util.ArrayList;

/**
 * Created by AEmbid on 2017.
 */

public class Deck {
    //clase que contiene todas las cartas
    ArrayList<Card> mazo;

    Deck() {
        for (int numpalos=0; numpalos<4; numpalos++) { //4 palos
            for (int numcarta=1; numcarta<=13;numcarta++) { //13 cartas por palo
                mazo.add(new Card(numpalos, numcarta)); //52 cartas en total
            }
        }
    }

    public void shuffle() { //barajar el mazo
        for (int pos=0;pos<mazo.size();pos++) {
            //TODO CHECK IF IT WORKS
            Card move = mazo.get(pos);
            int randomNum = 0 + (int)(Math.random() * 52);
            mazo.remove(pos);
            mazo.add(pos, mazo.get(randomNum));
        } //por cada carta, seleccionamos otra al azar y las intercambiamos
    }

    public Card deal() { //coger una carta
        //TODO CHECK IF IT WORKS
        int randomNum = 0 + (int)(Math.random() * 52);
        Card selected = mazo.get(randomNum);
        while (selected == null) randomNum = 0 + (int)(Math.random() * 52);
        mazo.remove(randomNum);
        return selected;
    } //seleccionamos una carta al azar y en caso de no estar en el mazo, lo recalculamos

}
