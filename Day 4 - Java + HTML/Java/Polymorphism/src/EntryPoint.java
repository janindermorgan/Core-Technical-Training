
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lloyds ref =new Lloyds();
		Banking(ref);
		
		HSBC hsbc =new HSBC();
		Banking(hsbc);
		
		Barclays barclays = new Barclays();
		Banking(barclays);
		System.out.println(2&3);
	}
	
	static public void Banking(CentralBank bankingRef) {
		bankingRef.showBalance();
		bankingRef.openAccount();
	}
}
