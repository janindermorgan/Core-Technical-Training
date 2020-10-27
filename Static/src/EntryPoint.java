
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account HSBC, Natwest;
		HSBC = new Account();
		Natwest = new Account();
		HSBC.setdollar(102);
		HSBC.amount(2);
		Natwest.amount(4);
	}
//with static members you only need to set dollar once not for all types of account e.g. hsbc and natwest
}
