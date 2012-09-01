package com.adaptionsoft.games.uglytrivia;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class GameIsPlayableTest extends GameTest {
	@Test
	public void isPlayable_NoPlayers_ReturnsFalse() {
		boolean actual = game.isPlayable();

		assertFalse(actual);
	}

	@Test
	public void isPlayable_OnePlayer_ReturnsFalse() {
		game.add("Hans Wurst");

		boolean actual = game.isPlayable();

		assertFalse(actual);
	}

	@Test
	public void isPlayable_TwoPlayer_ReturnsTrue() {
		addHansWurstsWithNumber(2);

		assertTrue(game.isPlayable());
	}
}
