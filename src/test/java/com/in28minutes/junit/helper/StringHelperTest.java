package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("BCD",helper.truncateAInFirst2Positions("ABCD"));
		assertEquals("CA",helper.truncateAInFirst2Positions("ACA"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions3() {
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
