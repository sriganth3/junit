package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClassTest");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClassTest");
	}
	
	
	@Before
	public void before() {
		System.out.println("beforeTest");
	}
	
	@After
	public void after() {
		System.out.println("afterTest");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
