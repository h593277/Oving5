package hvl.no.data102.oppgaver;

public class Sorting {
	
	
	public <T extends Comparable<T>>T[] selectionSort(T[] tabell)
	{
		
		
		for(int i = 0; i < tabell.length; i++)
		{
			int min = i;
			for(int j = i+1; j < tabell.length; j++)
			{
				if(tabell[j].compareTo(tabell[min]) < 0)
				{
					min = j;
				}
			}
		T temp = tabell[min];
		tabell[min] = tabell[i];
		tabell[i] = temp;
			
		}
		
		return tabell;
	}
	
	
	public <T extends Comparable<T>>T[] insertionSort(T[] tabell)
	{
		for(int i = 1; i < tabell.length; i++)
		{
			T nokkel = tabell[i];
			int j = i-1;
			
			while(j >= 0 && tabell[j].compareTo(nokkel) > 0)
			{
				tabell[j+1] = tabell[j];
				j--;
			}
			tabell[j+1] = nokkel;
		}
		
		return tabell;
	}
	
	public <T extends Comparable<T>>T[] bubleSort(T[] tabell)
	{
		for(int i = 0; i < tabell.length; i++)
		{

			for(int j = 0; j < tabell.length-1; j++)
			{
				if(tabell[j].compareTo(tabell[j+1]) > 0)
				{
					T temp = tabell[j+1];
					tabell[j+1] = tabell[j];
					tabell[j] = temp;
				}
			}
		}
		
		return tabell;
	}
	
	public <T extends Comparable<T>>int quickPartition(T[] tabell, int lav, int hoy)
	{
		T pivot = tabell[hoy];
		int i = lav-1;
		
		for(int j = lav; j < hoy; j++)
		{
			if(tabell[j].compareTo(pivot) <= 0)
			{
				i++;
				T temp = tabell[i];
				tabell[i] = tabell[j];
				tabell[j] = temp;
			}
		}
		
		    T temp = tabell[i + 1];
		    tabell[i + 1] = tabell[hoy];
		    tabell[hoy] = temp;
		    return (i + 1);
		
	}
	
	public <T extends Comparable<T>>T[] quickSort(T[] tabell, int lav, int hoy)
	{
		if(lav < hoy)
		{
			int pivot = quickPartition(tabell, lav, hoy);
			quickSort(tabell, lav, pivot-1);
			quickSort(tabell, pivot+1, hoy);
		}
		
		return tabell;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>> void merge(T[] tabell, int lav, int mid, int hoy)
	{
		
	    T[] venstreTabell  = (T[]) new Comparable[mid - lav + 1];
        T[] hoyreTabell = (T[]) new Comparable[hoy - mid];
		
		for(int i = 0; i < venstreTabell.length; i++)
		{
			venstreTabell[i] = tabell[lav+i];
		}
		
		for(int j = 0; j < hoyreTabell.length; j++)
		{
			hoyreTabell[j] = tabell[mid + 1 + j];
		}
		
		int venstreIndeks = 0;
		int hoyreIndeks = 0;
		int indeks = lav;
		
		while(venstreIndeks < venstreTabell.length && hoyreIndeks < hoyreTabell.length)
		{
			if(venstreTabell[venstreIndeks].compareTo(hoyreTabell[hoyreIndeks]) <= 0)
			{
				tabell[indeks] = venstreTabell[venstreIndeks];
				venstreIndeks++;
			}
			else
			{
				tabell[indeks] = hoyreTabell[hoyreIndeks];
				hoyreIndeks++;
			}
			
			indeks++;
		}
		
		while(venstreIndeks < venstreTabell.length)
		{
			tabell[indeks] = venstreTabell[venstreIndeks];
			indeks++;
			venstreIndeks++;
		}
		
		while(hoyreIndeks < hoyreTabell.length)
		{
			tabell[indeks] = hoyreTabell[hoyreIndeks];
			indeks++;
			hoyreIndeks++;
		}
		
	}
	
	public <T extends Comparable<T>>T[] mergeSort(T[] tabell, int lav, int hoy)
	{
		if(lav < hoy)
		{
			int mid = (lav+hoy)/2;
			mergeSort(tabell, lav, mid);
			mergeSort(tabell, mid+1, hoy);
			
			merge(tabell, lav, mid, hoy);
		}
		
		return tabell;
	}
	

}
