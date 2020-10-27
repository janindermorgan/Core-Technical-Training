package trainingday1;

public class Results {

	public static void main(String[] args) {
			int physics, chemistry, maths, total;
		    float percentage;
		    physics=100;
		    chemistry=50;
		    maths=50;
		    total=physics+chemistry+maths;
		    percentage= (float)total*100/300;    
		    System.out.println(total);	
		    System.out.println(percentage);
	}

}
