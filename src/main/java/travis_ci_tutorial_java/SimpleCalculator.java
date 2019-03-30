package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
 
	public int divide(int a, int b) throws DivideByZeroException {
		if (b == 0) {
			throw new DivideByZeroException("Cannot divide by zero");
		}
		return a / b;
	}
	
	public String compare(int a, int b){
		String result; 
		
		if(a>b){
			result =  ("First number is greater.");
		}
		else if (b>a){
			result = ("Second number is greater.");
		}
		else{
			result = ("Numbers are equal.");
		}
		return result;
	}
}
