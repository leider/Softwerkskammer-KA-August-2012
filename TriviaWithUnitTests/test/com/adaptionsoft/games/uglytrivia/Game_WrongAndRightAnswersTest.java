package com.adaptionsoft.games.uglytrivia;

import static junit.framework.Assert.*;

import org.junit.*;

public class Game_WrongAndRightAnswersTest extends Superklasse {

	@Test
	public void gameWithOnePlayer_wrongAnswerSendsPlayerToPenaltyBox() {
		game.add("Hans");
		game.wrongAnswer();
		resetOutput();
		game.wasCorrectlyAnswered();
		assertEquals("", getText());
	}

	@Test
	public void gameWithOnePlayer_wrongAnswerTwiceGivesSameOutput() {
		game.add("Hans");
		game.wasCorrectlyAnswered();
		resetOutput();
		game.wrongAnswer();
		assertEquals("Question was incorrectly answered\n"
				+ "Hans was sent to the penalty box\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wrongAnswerOnceSendsFirstPlayerToPenaltyBox() {
		game.add("Hans");
		game.add("Christian");
		game.wrongAnswer();
		resetOutput();
		game.wasCorrectlyAnswered();
		assertEquals("Answer was corrent!!!!\n"
				+ "Christian now has 1 Gold Coins.\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wrongAnswerTwiceSendsBothPlayersToPenaltyBox() {
		game.add("Hans");
		game.add("Christian");
		game.wasCorrectlyAnswered();
		resetOutput();

		game.wrongAnswer();
		assertEquals("Question was incorrectly answered\n"
				+ "Christian was sent to the penalty box\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wrongAnswerThriceSendsFirstPlayerToPenaltyBox() {
		game.add("Hans");
		game.add("Christian");
		game.wrongAnswer();
		game.wasCorrectlyAnswered();
		resetOutput();

		game.wrongAnswer();
		assertEquals("Question was incorrectly answered\n"
				+ "Hans was sent to the penalty box\n", getText());
	}

	@Test
	public void gameWithTwoPlayers_wrongAnswerThriceSendsFirstPlayerToPenaltyBox2() {
		game.add("Hans");
		game.add("Christian");
		game.wrongAnswer();
		game.wasCorrectlyAnswered();
		resetOutput();

		game.wasCorrectlyAnswered();
		assertEquals("", getText());
	}

}
