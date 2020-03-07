package firstpkg;

public class Largestno {
	public static void main(String[] args) {
		int no1=1,no2=2,no3=3,no4=4;
		if((no1>no2) && (no1>no2) &&(no1>no4))
			System.out.println("no1 is largest"+no1);
		
		else if((no2>no3) && (no2>no1) &&(no2>no4))
			System.out.println("no2 is largest"+no2);
		
		else if((no3>no1) && (no3>no2) &&(no3>no4))
			System.out.println("no2 is largest"+no3);
		
		
		else
			System.out.println("no3 is largest"+no4);
			
	}

}
