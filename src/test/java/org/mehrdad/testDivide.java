package org.mehrdad;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mehrdad.MyMath;
public class testDivide {

	MyMath mat;
	
	@Before
	public void setup()
	{
		mat = new MyMath();
	}
	
	@Test(expected=ArithmeticException.class)
	public void testZero() {
		
		System.out.println(mat.divide(10, 0));
		
		mat.divide(10, 0);
		
	}
	
	@Test
	public void testLessThanOne()
	{
		double res = mat.divide(1, 5);
		
		assertEquals(0.2, res, 0.0);
	}
	
	@Test
	public void testMoreThanOne()
	{
		double res = mat.divide(5, 2);
		assertEquals(2.5, res, 0.0);
	}

}
