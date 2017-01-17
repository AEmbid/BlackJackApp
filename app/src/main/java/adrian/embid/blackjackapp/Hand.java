package adrian.embid.blackjackapp;

import java.util.ArrayList;

/**
 * Created by AEmbid on 2017.
 */

public class Hand {
    //clase que contiene cartas agrupadas y calcula puntuaciones
    ArrayList<Card> in_hand;

    public void add_card(Card c) {
        in_hand.add(c);
    }

    public int get_value() { //calcular puntuaciones
        int value = 0; //valor de la mano
        boolean aceflag = false; //flag de si tiene algun AS
        for (int a = 0; a<in_hand.size();a++) {
            int current = in_hand.get(a).get_rank(); //obtenemos el rango de la carta
            if (current>10) current = 10; //si el rango es de figura, el valor es 10
            value += current; // sumamos el valor de la carta al total
            if (current == 1) aceflag = true; //comprobamos si tenemos algun AS
        }
        if (value < 12 && aceflag) value += 10; //si tenemos algun AS y no perdemos contandolo como 11, sumamos 10(1+10);
        return value;
    }


}
