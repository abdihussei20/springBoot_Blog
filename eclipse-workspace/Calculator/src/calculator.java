
public class calculator {
	public static void main (String[] args) {
		CALC.add(6,2);
		CALC.subtract(6,2);
		CALC.multiply(6,2);
		CALC.divide(6,2);
		CALC.square(9);	
		
	}
	public class CALC {
		

	public static void add (int num1, int num2) {
		int sum = num1 + num2;
		System.out.printf(" %d + %d = %d \n",num1, num2, sum);
	}
	public static void subtract (int num1, int num2) {
		int subtract = num1 - num2;
		System.out.printf(" %d - %d = %d \n",num1, num2, subtract);
	}
	public static void multiply (int num1, int num2) {
		int multiply = num1 * num2;
		System.out.printf(" %d * %d = %d \n",num1, num2, multiply);
	}
	public static void divide (int num1, int num2) {
		int divide = num1 / num2;
		System.out.printf(" %d / %d = %d \n",num1, num2, divide);
	}
	public static void square (int num1) {
		
	int square =  num1 * num1;
	System.out.printf(" %d ^ %d= %d \n",num1, num1, square);	
		}
	}
}
