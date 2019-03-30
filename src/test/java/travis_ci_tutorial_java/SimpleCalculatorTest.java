package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class SimpleCalculatorTest {
	
	SimpleCalculator calc;
	
	@Before
	public void setup(){
		calc = new SimpleCalculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(calc.subtract(5, 3), 2);
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(calc.multiply(2, 2), 4);
	}
	
	@Test
	public void testDivision() throws DivideByZeroException {
		assertEquals(calc.divide(2, 2), 1);	
	}
	
	@Test(expected =  DivideByZeroException.class)
	public void testDivisionByZero() throws DivideByZeroException {
		calc.divide(1, 0);
	}
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testDivisionByZeroMessage() throws DivideByZeroException {
		exceptionRule.expect(DivideByZeroException.class);
	    exceptionRule.expectMessage("Cannot divide by zero");
		calc.divide(1, 0);
	}
	
	@Test
	public void testCompare(){
		assertEquals(calc.compare(8, 5), ("First number is greater."));
	}
	
	@Test
	public void testCompare2(){
		assertEquals(calc.compare(3, 5), ("Second number is greater."));
	}
	
	@Test
	public void testCompare3(){
		assertEquals(calc.compare(5, 5), ("Numbers are equal."));
	}
		
}
