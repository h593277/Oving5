package hvl.no.data102.klient;

import hvl.no.data102.oppgaver.DobbelKjedetListe;
import hvl.no.data102.oppgaver.Sorting;

public class Klient {

	public static void main(String[] args) {
		DobbelKjedetListe<Integer> listeTest = new DobbelKjedetListe<Integer>(0,100000);
		
		listeTest.leggTil(10);
		listeTest.leggTil(5);
		listeTest.leggTil(100);
		listeTest.leggTil(34);
		listeTest.visListe();
		listeTest.fjern(5);
		System.out.println("------------------");
		listeTest.visListe();
		System.out.println(listeTest.fins(34));
		
		
		Integer[] test = {10, 5, 33, 20, 11, 23};
		
		for(int i : test)
		{
			System.out.println(i);
		}
		
		Sorting soekTest = new Sorting();
		
		test = soekTest.quickSort(test, 0, test.length-1);
		
		System.out.println("------------------");
		
		for(int i : test)
		{
			System.out.println(i);
		}

	}

}
