package firstpkg;

public class PrimeN {
	public static void main(String[] args) {

		int chkno = 10;
		int xxx = 111;
		for (int i = 2; i < chkno; i++) {
			if (chkno % i == 0) {
				xxx = 222;
				break;

			}
		}
		if (xxx == 111) {

			System.out.println("prime no");

		}

		else {
			System.out.println("not prime no");
		}
	}
}
