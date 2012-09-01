package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.*;

import org.junit.*;

public class Game_RollTest extends Superklasse {

	@Test
	public void onePlayerRolls0AndGetsPopQuestion0AndLocation0() {
		game.roll(0);
		assertRolledText(0, 0, "Pop", getText());
	}

	@Test
	public void onePlayerRollsMinusOneAndGetsRockQuestion0AndLocationMinusOne() {
		game.roll(-1);
		assertRolledText(-1, -1, "Rock", getText());
	}

	@Test
	public void onePlayerRolls13AndGetsScienceQuestion0AndLocation1() {
		game.roll(13);
		assertRolledText(13, 1, "Science", getText());
	}

	@Test
	public void onePlayerRolls1AndGetsSportsQuestion0AndLocation1() {
		game.roll(1);
		assertRolledText(1, 1, "Science", getText());

	}

	@Test
	public void onePlayerRolls2AndGetsSportsQuestion0AndLocation2() {
		game.roll(2);
		assertRolledText(2, 2, "Sports", getText());
	}

	@Test
	public void onePlayerRolls3AndGetsRockQuestion0AndLocation3() {
		game.roll(3);
		assertRolledText(3, 3, "Rock", getText());

	}

	@Test
	public void onePlayerRolls4AndGetsPopQuestion0AndLocation4() {
		game.roll(4);
		assertRolledText(4, 4, "Pop", getText());

	}

	@Test
	public void onePlayerRolls5AndGetsScienceQuestion0AndLocation5() {
		game.roll(5);
		assertRolledText(5, 5, "Science", getText());
	}

	@Test
	public void onePlayerRolls6AndGetsSportsQuestion0AndLocation6() {
		game.roll(6);
		assertRolledText(6, 6, "Sports", getText());
	}

	@Test
	public void onePlayerRolls11AndGetsSportsQuestion0AndLocation6() {
		game.roll(11);
		assertRolledText(11, 11, "Rock", getText());
	}

	@Test
	public void onePlayerRolls12AndGetsPopQuestion0AndLocation0() {
		game.roll(12);
		assertRolledText(12, 0, "Pop", getText());
	}

	private void assertRolledText(int rolled, int location, String category,
			String text) {
		assertEquals("Hans is the current player\n" + "They have rolled a "
				+ rolled + "\n" + "Hans's new location is " + location + "\n"
				+ "The category is " + category + "\n" + category
				+ " Question 0\n", text);
	}

	@Before
	public void setUp() {
		game.add("Hans");
		resetOutput();
	}
}
