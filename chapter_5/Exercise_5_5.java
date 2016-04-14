/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_5_5 {
    private final Deck deck = new Deck();
    private final BlackjackHand player = new BlackjackHand();
    private final BlackjackHand dealer = new BlackjackHand();
    
    /**
     * playOneGame() simulates one game.
     * playOneGame() returns a boolean value to indicate whether the user wins 
     * the game or not. Returns true if the user wins, false if the dealer wins.
     * @return boolean - true if the user wins, false if the dealer wins.
     */
    public boolean playOneGame() {
        deck.shuffle();
        dealer.clear();
        player.clear();
        
        dealer.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        
        boolean playersTurn = true;
        boolean playerWin = false;
        boolean inGame = true;
        
        while (inGame) {
            System.out.println("****************");
            System.out.println("Dealer's hand:");
            showHand(dealer, !playersTurn);
            System.out.println("Player's hand:");
            showHand(player, true);
            
            if (dealer.getBlackjackValue() < 21 && player.getBlackjackValue() < 21) {
                if (playersTurn) {
                    System.out.print("Hit (H) or Stand (S)? " );
                    char ch = TextIO.getChar();
                    if (Character.toUpperCase(ch) == 'H') {
                        player.addCard(deck.dealCard());
                        if (player.getBlackjackValue() > 21) {
                            inGame = false;
                            playerWin = false;
                        }
                    }
                    else {
                        playersTurn = false;
                    }
                }
                else {
                    while (dealer.getBlackjackValue() < 17) dealer.addCard(deck.dealCard());
                    inGame = false;
                    playerWin = compareHands(player, dealer);
                }
            }
            else {
                inGame = false;
                playerWin = compareHands(player, dealer);
            }
        }
        
        System.out.println("Result of a game:\n*****************");
        System.out.println("Dealer's hand:");
        showHand(dealer, true);
        System.out.println("Dealer has " + dealer.getBlackjackValue());
        System.out.println("Player's hand:");
        showHand(player, true);
        System.out.println("Player has " + player.getBlackjackValue());
        if (playerWin) System.out.println("Player wins!");
        else System.out.println("Dealer wins!");
        return playerWin;
    }
    
    /**
     * Displays given hand. If hand is empty showHand() displays nothing.
     * @param hand hand of cards to display
     * @param showWholeHand boolean - if True displays al cards in hand. If False displays only one card.
     */
    private void showHand(BlackjackHand hand, boolean showWholeHand) {
        if (hand.getCardCount() == 0) return;
        if (!showWholeHand) System.out.println(hand.getCard(0));
        else for (int i = 0; i < hand.getCardCount(); i++) System.out.println(hand.getCard(i));
    }
    
    /**
     * Compares player's and dealer's hands of cards.
     * @param player Player's hand of cards
     * @param dealer Dealer's hand of cards
     * @return boolean - True if Player wins, False if Dealer wins
     */
    private boolean compareHands(BlackjackHand player, BlackjackHand dealer) {
        if (dealer.getBlackjackValue() == 21) return false;
        if (player.getBlackjackValue() == 21) return true;
        if (dealer.getBlackjackValue() > 21) return true;
        if (player.getBlackjackValue() > 21) return false;
        if (player.getBlackjackValue() > dealer.getBlackjackValue()) return true;
        return false;
    }
    
    private boolean check() {
        return false;
    }
    
    public static void main(String[] args) {
        Exercise_5_5 game = new Exercise_5_5();
        boolean playAgain = true;
        int gameRound = 0, playerWins = 0, dealerWins = 0;
        
        while (playAgain) {
            System.out.println("Game #" + (++gameRound));
            if (game.playOneGame()) playerWins++;
            else dealerWins++;
            System.out.print("Game is over. Play again?");
            playAgain = TextIO.getBoolean();
            System.out.printf("Dealer wins %d times\n", dealerWins);
            System.out.printf("Player wins %d times\n", playerWins);
        }
    }
}
 
