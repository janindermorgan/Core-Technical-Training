import javax.print.attribute.standard.NumberUpSupported;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {21,34,5,6,7,44,5,45,65};
		int i=0;
		
		System.out.println(number[i]);
		
		//for length of array
		System.out.println(number.length);
		
		// using for loop to print large arrays, remember: starts at 0 so length-1
		for (i=0;i<number.length;i+=1) {
			System.out.println(i+")" + number[i]);
		}
		
		//Summing arrays
		int total=0;
		for (i=0;i<number.length;i+=1) {
			total = total + number[i];
		}
		System.out.println("The total is: " + total);
		
		//find biggest value
		int bignumber = 0;
		for (i=0;i<number.length;i+=1) {
			if(number[i]>bignumber) {
				bignumber=number[i];
			}
		}
		System.out.println("The biggest number is: " +bignumber);
	}

}
