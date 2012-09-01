package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameAddQuestionTest extends GameTest {

	@Test
	public void createRockQuestion_Index1_ReturnsRockQuestion1() {
		assertEquals("Rock Question 1", game.createRockQuestion(1));
	}

	@Test
	public void createRockQuestion_Index99_ReturnsRockQuestion99() {
		assertEquals("Rock Question 99", game.createRockQuestion(99));
	}

}
