
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, result;
		number1=20;
		number2=0;
	
	try {
		result = number1/number2;
		System.out.println("The answer is: "+ result);
		System.out.println("It works");
	}

	catch(ArithmeticException ref1) {
		//Exception Handler
		System.out.println("You are unable to divide by zero");
	}
	catch(NumberFormatException ref2) {
		System.out.println("Can do the conversion");
	}
	}
}
