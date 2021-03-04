package hvl.no.data102.oppgaver;


public class DobbelKjedetListe<T extends Comparable<T>> {
	
	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;
	
	public DobbelKjedetListe(T minVerdi, T maksVerdi)
	{
		foerste = new DobbelNode<T>(minVerdi);
		siste = new DobbelNode<T>(maksVerdi);
		foerste.setNeste(siste);
	
		siste.setForrige(foerste);
		antall = 0;
	}
	
	public void leggTil(T ny)
	{
		DobbelNode<T> newNode = new DobbelNode<T>(ny);
		newNode.setNeste(null);
		if(antall == 0)
		{
			newNode.setForrige(foerste);
			foerste.setNeste(newNode);
			newNode.setNeste(siste);
			siste.setForrige(newNode);
		}
		else
		{
			DobbelNode<T> curr = foerste;
			while(curr.getNeste() != null && curr.getNeste().getElement().compareTo(newNode.getElement()) < 0) 
			{
				curr = curr.getNeste();
			}
			
			newNode.setNeste(curr.getNeste());
			
			if(curr.getNeste() != null)
			{
				newNode.getNeste().setForrige(newNode);
			}
			
			curr.setNeste(newNode);
			newNode.setForrige(curr);
		}
		
		antall++;
	}
	
	public T fjern(T x)
	{
		DobbelNode<T> fjern = new DobbelNode<T>(x);
		DobbelNode<T> curr = foerste;
		
		while(curr.getNeste() != null && curr.getElement() != fjern.getElement())
		{
			curr = curr.getNeste();
		}
		
		if(curr.getNeste() != null)
		{
			curr.getNeste().setForrige(curr.getForrige());
			curr.getForrige().setNeste(curr.getNeste());
			antall--;
			return fjern.getElement();
		}
		
		return null;
	}
	
	public boolean fins(T finnes)
	{
		DobbelNode<T> curr = foerste;

		while(curr.getNeste() != null && !curr.getElement().equals(finnes))
		{
			curr = curr.getNeste();
		}
		
		if(curr.getNeste() != null)
		{
			return true;
		}
		
		return false;
	}
	
	public void visListe()
	{
		DobbelNode<T> temp;
		temp = foerste;
		
		while(temp.getElement() != null)
		{
			System.out.println(temp.getElement().toString());
			
			if(temp.getNeste() != null)
				temp = temp.getNeste();
			else
				break;
		}
	}

}
