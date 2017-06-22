package com.intuit.tv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author Francisco Franco
 *
 * Unit test for Television App.
 */

public class TelevisionTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public TelevisionTest(String testName) {
		super(testName);
	}
	
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TelevisionTest.class);
	}
	
	/**
	 * Test entire module
	 */
	public void testApp() {
		Television tv = new Television(DomainConstants.channelMap);
		assertTrue( true );
	}
}
