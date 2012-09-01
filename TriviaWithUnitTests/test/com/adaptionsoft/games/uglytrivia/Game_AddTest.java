package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.*;

import org.junit.*;

public class Game_AddTest extends Superklasse {

	@Test
	public void additionGoesToConsole() throws Exception {
		addPlayersWithSameName(1, "Klaus");
		assertEquals("Klaus was added\nThey are player number 1\n", getText());
	}

	@Test
	public void playerCountForOnePlayerIsOne() {
		addPlayersNamedPeter(1);
		assertEquals(1, game.howManyPlayers());
	}

	@Test
	public void playerCountForTwoPlayersWithDifferentNamesIsTwo() {
		game.add("Hans");
		game.add("Karl");
		assertEquals(2, game.howManyPlayers());
	}

	@Test
	public void playerCountForTwoPlayersIsTwo() {
		addPlayersNamedPeter(2);
		assertEquals(2, game.howManyPlayers());
	}

	@Test
	public void playerCountForFivePlayersIsFive() {
		addPlayersNamedPeter(5);
		assertEquals(5, game.howManyPlayers());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void sixPlayersThrowsException() {
		addPlayersNamedPeter(6);
	}

}
