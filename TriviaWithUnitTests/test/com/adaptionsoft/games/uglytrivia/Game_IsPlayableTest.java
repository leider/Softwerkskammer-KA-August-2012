package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.*;

import org.junit.*;

public class Game_IsPlayableTest extends Superklasse {
	@Test
	public void gameWithOnePlayerIsNotPlayable() {
		addPlayersNamedPeter(1);
		assertFalse(game.isPlayable());
	}

	@Test
	public void gameWithTwoPlayersIsPlayable() {
		addPlayersNamedPeter(2);
		assertTrue(game.isPlayable());
	}

	@Test
	public void gameWith5PlayersIsPlayable() {
		addPlayersNamedPeter(5);
		assertTrue(game.isPlayable());
	}
}
