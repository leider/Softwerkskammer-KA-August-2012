package com.adaptionsoft.games.uglytrivia;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class Game_InitialStateTest extends Superklasse {

	@Test
	public void newGameHasNoPlayers() {
		assertThat(game.howManyPlayers(), is(0));
	}

	@Test
	public void gameWithoutPlayersIsNotPlayable() {
		assertFalse(game.isPlayable());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void gameWithoutPlayersDoesNotWorkOn_wasCorrectlyAnswered() {
		game.wasCorrectlyAnswered();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void gameWithoutPlayersDoesNotWorkOn_wrongAnswer() {
		game.wrongAnswer();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void gameWithoutPlayersThrowsIndexOutOfBoundsOnRolling1()
			throws Exception {
		game.roll(1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void gameWithoutPlayersThrowsIndexOutOfBoundsOnRolling0()
			throws Exception {
		game.roll(0);
	}
}
