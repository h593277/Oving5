package no.hvl.dat102.oppg1;


public class Rekursiv {
	public static void main(String[] args) {
		System.out.println("a)");
		System.out.println(S(100));
		
		System.out.println("b)");
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + " " + a(i));
		}
		System.out.println("c)");
		for(int i = 1; i < 35; i++) {
			long totalTime = 0;
			TowersOfHanoi towers = new TowersOfHanoi(i);
			for(int j = 0; j < 5; j++) {
				long start = System.nanoTime();
				towers.solve();
				totalTime += System.nanoTime() - start;
			}
			long averageTime = totalTime/5;
			
			System.out.println("Antall disker: " + i);
			System.out.println("Antall flyttinger: " + towers.getMoves()/5);
			System.out.format("Antall millisekunder: %f\n\n", (double)averageTime/1000000);
		}
		
		
		
	}
	
	public static int S(int n) {
		int s = 1;
		if(n > 1)
			s = n + S(n-1);
		return s;
	}
	public static int a(int n) {
		int a = 2;
		if(n > 0)
			a = 5;
		if(n > 1)
			a = 5*a(n-1) - 6*a(n-2) + 2;
		return a;
	}
	
}
