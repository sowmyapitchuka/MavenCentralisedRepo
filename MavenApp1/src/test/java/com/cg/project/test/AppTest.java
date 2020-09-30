package com.cg.project.test;

import static org.junit.Assert.fail;

import org.junit.Test;

public class AppTest {
	@Test
public void test1() {
	System.out.println("test1");
}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		fail();
	}
	@Test
	public void test4() {
		fail();
	}
}
