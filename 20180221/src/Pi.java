
public class Pi {
	public static void main(String[] args) {
		//wallis-formula
		double pi = 1;
		int darab = 100000 / 2;
		
		for (int i = 1; i <= darab; i++) {
			pi *= 2 * i/(double)(2 * i - 1);
			pi *= 2 * i/(double)(2 * i + 1);
		}
		System.out.println("Wallis-formula");
		System.out.println("pi/2 értéke: " + pi);
		System.out.println("pi értéke: " + pi * 2);
		
		//Leinbiz-féle sor
		
		pi = 0;
		darab *= 4;
		int elojel = 1;
		
		for (int i = 1; i <= darab ; i += 2) {
			pi += elojel * 1 / (double)i;
			elojel *= -1;
		}
		System.out.println("Leinbiz-féle sor");
		System.out.println("pi/4 értéke: " + pi);
		System.out.println("pi értéke: " + pi * 4);
	}
}
