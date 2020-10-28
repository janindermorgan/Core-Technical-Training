
public class Account {
	static int dollar;
	public void amount(int amo) {
		int T = amo*dollar;
		System.out.println("Amount is: " +T);
	}
	public void setdollar(int d) {
		dollar = d;
	}
	
}
