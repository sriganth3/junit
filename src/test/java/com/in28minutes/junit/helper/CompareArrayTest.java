package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CompareArrayTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] nums = {10,20,40,30};
		Arrays.sort(nums);
		int[] expected = {10,20,30,40};
		assertArrayEquals(expected, nums);
	}

	@Test(expected = NullPointerException.class)
	public void testArray_Exception() {
		int[] nums = null;
		Arrays.sort(nums);
	}
}
