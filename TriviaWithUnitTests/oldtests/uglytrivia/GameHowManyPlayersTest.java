package com.adaptionsoft.games.uglytrivia;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class GameHowManyPlayersTest extends GameTest {
	@Test
	public void howManyPlayer_NewGame_Return0() {
		assertEquals(0, game.howManyPlayers());
	}

	@Test
	public void howManyPlayer_AddOnePlayer_Return1() {
		game.add("Hans Wurst 1");

		assertEquals(1, game.howManyPlayers());
	}

	@Test
	public void howManyPlayer_AddTwoPlayerWithSameName_Return2() {
		game.add("Hans Wurst");
		game.add("Hans Wurst");

		assertEquals(2, game.howManyPlayers());
	}

	@Test
	public void howManyPlayer_AddFivePlayer_Return5() {
		int numberOfPlayer = 5;
		addHansWurstsWithNumber(numberOfPlayer);

		assertEquals(numberOfPlayer, game.howManyPlayers());
	}

}
