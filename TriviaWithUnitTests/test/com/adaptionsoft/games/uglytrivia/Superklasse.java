package com.adaptionsoft.games.uglytrivia;

import java.io.*;

import org.junit.*;

public class Superklasse {

	protected Game game = new Game();
	private PrintStream out;

	protected void addPlayersNamedPeter(int count) {
		addPlayersWithSameName(count, "Peter");
	}

	protected void addPlayersWithSameName(int count, String playerName) {
		for (int i = 0; i < count; i++) {
			game.add(playerName);
		}
	}

	@Before
	public void changeSystemOut() {
		try {
			out = new PrintStream("lastRun");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(out);
	}

	@After
	public void closeSystemOut() {
		out.flush();
	}

	protected void resetOutput() {
		closeSystemOut();
		changeSystemOut();
	}

	protected String getText() {
		try {
			String result = "";
			FileReader reader;
			reader = new FileReader("lastRun");
			BufferedReader buffered = new BufferedReader(reader);
			while (buffered.ready()) {
				result += buffered.readLine();
				result += "\n";
			}
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
