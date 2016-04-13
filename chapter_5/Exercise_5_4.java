
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_5_4 {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        BlackjackHand bjh = new BlackjackHand();
        
        Random rnd = new Random();
        
        do {
            deck.shuffle();
            bjh.clear();
            for (int i = 0; i < rnd.nextInt(4)+2; i++) bjh.addCard(deck.dealCard());
            for (int i = 0; i < bjh.getCardCount(); i++) System.out.println(bjh.getCard(i));
            System.out.println(bjh.getBlackjackValue());
            System.out.println("Do you whant to continue (y/n)");
        } while (TextIO.getChar() != 'n');
    }
    
}
