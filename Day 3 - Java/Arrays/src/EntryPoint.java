
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {21,34,5,6,7,44,5,45,65};
		//accessing elements from array
		System.out.println(number[0]);
		System.out.println(number[3]);
		System.out.println(number[7]);
		
		//storing values
		number[1]=3100;
		System.out.println(number[1]);
		
		//exception for calling value outside of array
		try {
			System.out.println(number[0]);
			System.out.println(number[3]);
			System.out.println(number[70]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outside of array");
		}
	}

}
