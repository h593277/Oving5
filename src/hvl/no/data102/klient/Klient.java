package hvl.no.data102.klient;

import hvl.no.data102.oppgaver.DobbelKjedetListe;
import hvl.no.data102.oppgaver.Sorting;

public class Klient {

	public static void main(String[] args) {
//		DobbelKjedetListe<Integer> listeTest = new DobbelKjedetListe<Integer>(0,100000);
		
//		listeTest.leggTil(10);
//		listeTest.leggTil(5);
//		listeTest.leggTil(100);
//		listeTest.leggTil(34);
//		listeTest.visListe();
//		listeTest.fjern(5);
//		System.out.println("------------------");
//		listeTest.visListe();
//		System.out.println(listeTest.fins(34));
		
		
		Integer[] test = new Integer[12800];
		
		
//		for(int i : test)
//		{
//			System.out.println(i);
//		}
		
		for(int i = 0; i < test.length; i++)
		{
			test[i] = (int) Math.random()*(100000-0+1)+0;
			//test[i] = 10;
		}
		
		Sorting soekTest = new Sorting();
		final long startTime = System.nanoTime();
		test = soekTest.quickSort(test, 0, test.length-1);
		
//		System.out.println("------------------");
//		
//		for(int i : test)
//		{
//			System.out.println(i);
//		}
		
		final long duration = System.nanoTime() - startTime;
		System.out.println("Tid i millisekunder:" + duration/100000);
	}

}
