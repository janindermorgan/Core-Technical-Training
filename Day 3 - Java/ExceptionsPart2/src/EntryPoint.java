
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts salesdepartment=new Accounts();
		Accounts ITdepartment= new Accounts();
		
		try {
			salesdepartment.SalarySlip("Janinder", 1439, 9);
		}
		catch(AbsentiesException E) {
			System.out.println("Please send the report");
		}
		
		try { ITdepartment.SalarySlip("Morgan", 4000, 365);
	
		}
		catch(AbsentiesException E) {
			System.out.println("It is an exception within the IT department");
		}
	}

}
