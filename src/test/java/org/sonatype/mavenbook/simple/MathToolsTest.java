package org.sonatype.mavenbook.simple;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathToolsTest {
	private MathTools tools;

	public MathToolsTest() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tools = new MathTools();
	}

	@After
	public void tearDown() throws Exception {
		tools=null;
	}

	@Test
	public void testFacto() {
		assertEquals(1,tools.factorielle(0));
		
	}

}
