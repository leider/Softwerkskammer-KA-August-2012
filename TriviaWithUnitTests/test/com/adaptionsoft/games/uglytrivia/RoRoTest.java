package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.*;

import org.junit.*;

public class RoRoTest extends Superklasse {

	@Test
	public void onePlayerRolls0AndGetsPopQuestion0AndLocation0() {
		game.roll(0);
		resetOutput();
		game.roll(0);
		assertRolledText(0, 0, "Pop", getText(), 1);
	}

	@Test
	public void onePlayerRollsMinusOneAndGetsRockQuestion0AndLocationMinusOne() {
		game.roll(-1);
		resetOutput();
		game.roll(-1);
		assertRolledText(-1, -2, "Rock", getText(), 1);
	}

	@Test
	public void onePlayerRolls13AndGetsScienceQuestion0AndLocation1() {
		game.roll(13);
		resetOutput();
		game.roll(13);
		assertRolledText(13, 2, "Sports", getText(), 0);
	}

	@Test
	public void onePlayerRolls1AndGetsSportsQuestion0AndLocation1() {
		game.roll(1);
		resetOutput();
		game.roll(1);
		assertRolledText(1, 2, "Sports", getText(), 0);

	}

	@Test
	public void onePlayerRolls2AndGetsSportsQuestion0AndLocation2() {
		game.roll(2);
		resetOutput();
		game.roll(2);
		assertRolledText(2, 4, "Pop", getText(), 0);
	}

	@Test
	public void onePlayerRolls3AndGetsRockQuestion0AndLocation3() {
		game.roll(3);
		resetOutput();
		game.roll(3);
		assertRolledText(3, 6, "Sports", getText(), 0);

	}

	@Test
	public void onePlayerRolls4AndGetsPopQuestion0AndLocation4() {
		game.roll(4);
		resetOutput();
		game.roll(4);
		assertRolledText(4, 8, "Pop", getText(), 1);

	}

	@Test
	public void onePlayerRolls5AndGetsScienceQuestion0AndLocation5() {
		game.roll(5);
		resetOutput();
		game.roll(5);
		assertRolledText(5, 10, "Sports", getText(), 0);
	}

	@Test
	public void onePlayerRolls6AndGetsSportsQuestion0AndLocation6() {
		game.roll(6);
		resetOutput();
		game.roll(6);
		assertRolledText(6, 0, "Pop", getText(), 0);
	}

	@Test
	public void onePlayerRolls11AndGetsSportsQuestion0AndLocation6() {
		game.roll(11);
		resetOutput();
		game.roll(11);
		assertRolledText(11, 10, "Sports", getText(), 0);
	}

	@Test
	public void onePlayerRolls12AndGetsPopQuestion0AndLocation0() {
		game.roll(12);
		resetOutput();
		game.roll(12);
		assertRolledText(12, 0, "Pop", getText(), 1);
	}

	private void assertRolledText(int rolled, int location, String category,
			String text, int number) {
		assertEquals("Hans is the current player\n" + "They have rolled a "
				+ rolled + "\n" + "Hans's new location is " + location + "\n"
				+ "The category is " + category + "\n" + category
				+ " Question " + number + "\n", text);
	}

	@Before
	public void setUp() {
		game.add("Hans");
		resetOutput();
	}
}
