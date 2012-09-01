package com.adaptionsoft.games.uglytrivia;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GameRollTest extends GameTest {
	private final static String _questionPop = "Pop";
	private final static String _questionScience = "Science";
	private final static String _questionSports = "Sports";
	private final static String _questionRock = "Rock";

	private final Map<Integer, String> dictPosQuestion = new HashMap<Integer, String>();
	{
		dictPosQuestion.put(0, _questionPop);
		dictPosQuestion.put(1, _questionScience);
		dictPosQuestion.put(2, _questionSports);
		dictPosQuestion.put(3, _questionRock);
		dictPosQuestion.put(4, _questionPop);
		dictPosQuestion.put(5, _questionScience);
		dictPosQuestion.put(6, _questionSports);
		dictPosQuestion.put(7, _questionRock);
		dictPosQuestion.put(8, _questionPop);
		dictPosQuestion.put(9, _questionScience);
		dictPosQuestion.put(10, _questionSports);
		dictPosQuestion.put(11, _questionRock);
	};

	@Test
	public void roll_NewGamePlayer1Location0Dice0_ReturnPop() throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(0, _questionPop);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice1_ReturnScience()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(1, _questionScience);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice2_ReturnSports()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(2, _questionSports);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice3_ReturnRock() throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(3, _questionRock);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice4_ReturnPop() throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(4, _questionPop);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice5_ReturnScience()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(5, _questionScience);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice6_ReturnSports()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(6, _questionSports);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice7_ReturnRock() throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(7, _questionRock);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice8_ReturnPop() throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(8, _questionPop);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice9_ReturnScience()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(9, _questionScience);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice10_ReturnSports()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(10, _questionSports);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice11_ReturnRock()
			throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(11, _questionRock);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice12_ReturnPop() throws Exception {
		newGame1PlayerInputDiceAndAssertQuestion(12, _questionPop);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice0_NewPositionIs0()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(0, 0);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice1_NewPositionIs1()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(1, 1);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice2_NewPositionIs2()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(2, 2);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice3_NewPositionIs3()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(3, 3);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice4_NewPositionIs4()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(4, 4);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice5_NewPositionIs5()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(5, 5);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice6_NewPositionIs6()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(6, 6);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice7_NewPositionIs7()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(7, 7);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice8_NewPositionIs8()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(8, 8);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice9_NewPositionIs9()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(9, 9);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice10_NewPositionIs10()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(10, 10);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice11_NewPositionIs11()
			throws Exception {
		newGamePlayer1Location0InputDiceAssertNewPosition(11, 11);
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice2x6_PositionIsResetTo0()
			throws Exception {
		addHansWurstsWithNumber(1);
		int dice = 6;
		game.roll(dice);
		resetOutput();
		game.roll(dice);

		String expected = expectedText("Hans Wurst 1", dice, 0);

		assertEquals(expected, getText());
	}

	@Test
	public void roll_NewGamePlayer1Location0Dice12_PositionIsResetTo0()
			throws Exception {
		addHansWurstsWithNumber(1);
		int dice = 12;
		resetOutput();
		game.roll(dice);

		String expected = expectedText("Hans Wurst 1", dice, 0);

		assertEquals(expected, getText());
	}

	@Test
	public void roll_NewGamePlayer1Location8Dice6_PositionIsResetTo2()
			throws Exception {
		addHansWurstsWithNumber(1);
		game.roll(4);
		game.roll(4);
		int dice = 6;
		resetOutput();
		game.roll(dice);

		String expected = expectedText("Hans Wurst 1", dice, 2);

		assertEquals(expected, getText());
	}

	@Test
	public void roll_NewGamePlayer1Location8InPenalityBoxDice5_LeavesPenalityBoxAndPositionIsResetTo1()
			throws Exception {
		addHansWurstsWithNumber(1);
		game.roll(4);
		game.roll(4);
		game.wrongAnswer();
		int dice = 5;
		resetOutput();
		game.roll(dice);

		String expected = expectedTextOutOfPenality("Hans Wurst 1", dice, 1);

		assertEquals(expected, getText());
	}

	@Test
	public void roll_NewGamePlayer1Location8InPenalityBoxDice6_DoesNotLeavesPenalityBoxAndPositionIs0()
			throws Exception {
		addHansWurstsWithNumber(1);
		game.roll(4);
		game.roll(4);
		game.wrongAnswer();
		int dice = 6;
		resetOutput();
		game.roll(dice);

		String expected = expectedTextNotOutOfPenality("Hans Wurst 1", dice);

		assertEquals(expected, getText());
	}

	@Test
	public void roll_OnePlayerDiceNegative1_CategoryIsRock() throws Exception {
		int dice = -1;
		String expected = "The category is Rock";
		game.add("Hans Wurst");
		game.roll(dice);

		assertTrue(getText().contains(expected));
	}

	@Test
	public void roll_OnePlayerDiceNegative2_CategoryIsRock() throws Exception {
		int dice = -2;
		String expected = "The category is Rock";
		game.add("Hans Wurst");
		game.roll(dice);

		assertTrue(getText().contains(expected));
	}

	@Test
	public void roll_OnePlayerDiceNegative4711_CategoryIsRock()
			throws Exception {
		int dice = -4711;
		String expected = "The category is Rock";
		game.add("Hans Wurst");
		game.roll(dice);

		assertTrue(getText().contains(expected));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void roll_NoPlayerDice1_ThrowException() {
		int dice = 1;
		game.roll(dice);
	}

	@Test
	public void roll_OnePlayerLocation0Dice11_LocationIs11() throws Exception {
		int dice = 11;
		String expected = "Hans Wurst's new location is 11";
		game.add("Hans Wurst");

		game.roll(dice);

		assertTrue(getText().contains(expected));
	}

	@Test
	public void roll_OnePlayerLocation0Dice11_LocationIs0() throws Exception {
		int dice = 12;
		String expected = "Hans Wurst's new location is 0";
		game.add("Hans Wurst");

		game.roll(dice);

		assertTrue(getText().contains(expected));
	}

	private void newGamePlayer1Location0InputDiceAssertNewPosition(int dice,
			int newPosition) throws Exception {
		addHansWurstsWithNumber(1);
		resetOutput();
		game.roll(dice);

		String expected = expectedText("Hans Wurst 1", dice, newPosition);

		assertEquals(expected, getText());
	}

	private void newGame1PlayerInputDiceAndAssertQuestion(int dice,
			String question) throws Exception {
		addHansWurstsWithNumber(1);
		resetOutput();

		game.roll(dice);

		assertTrue(getText().contains(question));
	}

	private String expectedText(String playerName, int dice, int newLocation) {
		String question = dictPosQuestion.get(newLocation);
		return String.format("%1$s is the current player\n"
				+ "They have rolled a %2$s\n" + "%1$s's new location is %4$s\n"
				+ "The category is %3$s\n" + "%3$s Question 0\n", playerName,
				dice, question, newLocation);
	}

	private String expectedTextOutOfPenality(String playerName, int dice,
			int newLocation) {
		String question = dictPosQuestion.get(newLocation);
		return String.format("%1$s is the current player\n"
				+ "They have rolled a %2$s\n"
				+ "%1$s is getting out of the penalty box\n"
				+ "%1$s's new location is %4$s\n" + "The category is %3$s\n"
				+ "%3$s Question 0\n", playerName, dice, question, newLocation);
	}

	private String expectedTextNotOutOfPenality(String playerName, int dice) {
		return String.format("%1$s is the current player\n"
				+ "They have rolled a %2$s\n"
				+ "%1$s is not getting out of the penalty box\n", playerName,
				dice);
	}

}
