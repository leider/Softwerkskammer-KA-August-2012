package com.adaptionsoft.games.uglytrivia;

import static junit.framework.Assert.*;

import org.junit.*;

public class Game_WasCorrectlyAnsweredTest extends Superklasse {

	@Test
	public void gameWithOnePlayer_wasCorrectlyAnsweredGivesGoldCoin() {
		game.add("Hans");
		resetOutput();
		game.wasCorrectlyAnswered();
		assertEquals("Answer was corrent!!!!\n"
				+ "Hans now has 1 Gold Coins.\n", getText());
	}

	@Test
	public void gameWithOnePlayer_wasCorrectlyAnsweredTwiceGivesAnotherGoldCoin() {
		game.add("Hans");
		game.wasCorrectlyAnswered();
		resetOutput();
		game.wasCorrectlyAnswered();
		assertEquals("Answer was corrent!!!!\n"
				+ "Hans now has 2 Gold Coins.\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wasCorrectlyAnsweredOnceGivesFirstPlayerGoldCoin() {
		game.add("Hans");
		game.add("Christian");
		resetOutput();
		game.wasCorrectlyAnswered();
		assertEquals("Answer was corrent!!!!\n"
				+ "Hans now has 1 Gold Coins.\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wasCorrectlyAnsweredTwiceGivesSecondPlayerGoldCoin() {
		game.add("Hans");
		game.add("Christian");
		game.wasCorrectlyAnswered();
		resetOutput();

		game.wasCorrectlyAnswered();
		assertEquals("Answer was corrent!!!!\n"
				+ "Christian now has 1 Gold Coins.\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wasCorrectlyAnsweredThriceGivesFirstPlayerSecondGoldCoin() {
		game.add("Hans");
		game.add("Christian");
		game.wasCorrectlyAnswered();
		game.wasCorrectlyAnswered();
		resetOutput();

		game.wasCorrectlyAnswered();
		assertEquals("Answer was corrent!!!!\n"
				+ "Hans now has 2 Gold Coins.\n", getText());
	}

}
