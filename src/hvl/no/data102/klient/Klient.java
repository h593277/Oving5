package hvl.no.data102.klient;

import hvl.no.data102.oppgaver.DobbelKjedetListe;

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

	}

}
