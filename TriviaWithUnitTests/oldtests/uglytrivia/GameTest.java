package com.adaptionsoft.games.uglytrivia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public class GameTest {

	protected Game game = new Game();
	protected final static String newLine = "\n";

	private PrintStream out;

	@Before
	public void changeSystemOut() throws Exception {
		out = new PrintStream("lastRun");
		System.setOut(out);
	}

	@After
	public void closeSystemOut() {
		out.flush();
	}

	protected void resetOutput() throws Exception {
		closeSystemOut();
		changeSystemOut();
	}

	protected String getText() throws Exception {
		String result = "";
		FileReader reader = new FileReader("lastRun");
		BufferedReader buffered = new BufferedReader(reader);
		while (buffered.ready()) {
			result += buffered.readLine();
			result += newLine;
		}
		return result;
	}

	protected void addHansWurstsWithNumber(int numberOfPlayer) {
		for (int player = 1; player <= numberOfPlayer; player++) {
			game.add(String.format("Hans Wurst %1$s", player));
		}
	}
}
