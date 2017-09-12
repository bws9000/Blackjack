package blackjack;

import java.util.ArrayList;

/**
 * @author PaulPearson
 *	The Table where the game setup takes place
 */

public class BlackjackTable {

	public void startGame() {

	}

	public static void playGame() {

		Deck deck = Deck.createDeck();
		Hand dealerHand = new Hand(new ArrayList<Card>());
		Hand playerHand = new Hand(new ArrayList<Card>());

		BlackjackDealer dealer = BlackjackDealer.startGame(dealerHand, deck);
		BlackjackPlayer player = BlackjackPlayer.joinGame(playerHand);

		dealer.setPlayer(player);
		player.setDealer(dealer);
		dealer.dealHand();
		// NOT WORKING YET dealer.viewHand();

		System.out.println(player);
		System.out.println(dealer);

		if (playerHand.getHandValue() > dealerHand.getHandValue()) {
			System.out.println("Player wins\n");
		} else if (dealerHand.getHandValue() > playerHand.getHandValue()) {
			System.out.println("Dealer wins\n");
		} else {
			System.out.println("Push\n");
		}
	}

}
