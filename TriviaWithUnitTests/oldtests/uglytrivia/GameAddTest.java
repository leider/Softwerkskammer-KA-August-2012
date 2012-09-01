package com.adaptionsoft.games.uglytrivia;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;



public class GameAddTest extends GameTest {

	@Test
	public void add_AddFivePlayer_WriteLineReturnsExpectedText()
			throws Exception {
		String expected = "";
		int numberOfPlayer = 5;
		for (int player = 1; player <= numberOfPlayer; player++) {
			expected += String.format(
					"Hans Wurst %1$s was added\nThey are player number %1$s\n",
					player);
			game.add(String.format("Hans Wurst %1$s", player));
		}
	
		assertEquals(expected, getText());
	}

	@Test
	public void add_AddOnePlayer_WriteLineReturnsExpectedText()
			throws Exception {
		String expected = "Hans Wurst 1 was added" + newLine
				+ "They are player number 1" + newLine;
	
		game.add("Hans Wurst 1");
	
		assertEquals(expected, getText());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void add_AddSixPlayer_ThrowException() {
		addHansWurstsWithNumber(6);
	}

	@Test
	public void add_AddTwoPlayerWithSameName_WriteLineReturnsExpectedText()
			throws Exception {
		String expected = "Hans Wurst was added" + newLine
				+ "They are player number 1" + newLine + "Hans Wurst was added"
				+ newLine + "They are player number 2" + newLine;
	
		game.add("Hans Wurst");
		game.add("Hans Wurst");
	
		assertEquals(expected, getText());
	}
}
