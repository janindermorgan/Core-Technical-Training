
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1, num2;
		float result;
		
		num1="Janinder";
		num2="0";
		
		try {
			result= Integer.parseInt(num1)/Integer.parseInt(num2);
			System.out.println("Result is: " + result);
		}
//ref1 ref2 and ref can be anything - local variable any letters
		catch(NumberFormatException ref1) {
			System.out.println("Only integers can be used in operations");
		}
		catch(ArithmeticException ref2) {
			System.out.println("Unable to divide by zero");
		}
		/*Catches any exception not captured above, although none really apply in this example. If you
		 * place it above the other catches, it will catch all exceptions including those listed below.
		*/
		catch(Exception ref) {
			System.out.println("Something went wrong");
		}
	}

}
