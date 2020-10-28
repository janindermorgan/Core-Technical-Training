
public class Exams {
	private int phy, che, total, max_phy_mark, max_chem_mark;
	private float per, chemper, phyper;
	
	public Exams() {
		max_phy_mark=100;
		max_chem_mark=200;
	}
	public Exams(int A) {
		max_phy_mark = A;
		max_chem_mark = A;
	}
	
	public void total() {
		total = phy + che;
		System.out.println("The total is:" + total );
	}
	public void percentage() {
		per = total * 100/(max_phy_mark+max_chem_mark);
	}
	public void physics(int p) {
		if(p>=0 && p<=max_phy_mark) {
			phy=p;
			System.out.println("markisok");
		}
		else {
			System.out.println("Invalid Physics Mark");
		}
	}
		public void chemistry(int c) {
			if(c>=0 && c<=max_chem_mark) {
				che=c;
				System.out.println("markisok");
			}
			else {
				System.out.println("Invalid Chemistry Mark");
			}
			
	}
	public void chemper() {
		chemper = che*100/(max_chem_mark);
		System.out.println("Chemistry percent is: " + chemper);
	}
	public void phyper() {
		phyper = phy*100/(max_phy_mark);
		System.out.println("Physics percent is: " + phyper);
	}
	
}
