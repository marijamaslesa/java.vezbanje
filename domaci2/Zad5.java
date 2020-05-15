package domaci2;

import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		/* Za uneti niz celih brojeva duzine n (koja se takodje unosi), 
		 * sortirati niz, ispitati da li sadrzi broj x i ispisati prvih 5 clanova niza na standardni izlaz.
		 *  Koristiti klasu Arrays
		 */
		int n,a,x;
		int nova;
		Scanner sc= new Scanner (System.in);
		System.out.println("Unesite broj clanova niza");
		n = sc.nextInt();
		int [] niz = new int [n];
		//pravljenje niza
		for(int i=0;i<n;i++)
		{ System.out.println("Unesite clan niza");
		a= sc.nextInt();
		niz[i]= a;			
		}
		int[] copy = Arrays.copyOf(niz, 5);	 // prvih pet elemenata
		
		
		sortiranje (niz);
		System.out.println("Sortiran niz je: " + Arrays.toString(niz)); // sortiran niz
		
		System.out.println("Prvih pet elemenata: " + Arrays.toString(copy)); // kopija prvih pet elemenata
		
		
		System.out.println("Unesite broj x");
		x = sc.nextInt();
		nova = provera (niz, x);
		if (nova == 0) System.out.println("Broj "+ x + " se ne nalazi u nizu");
		else System.out.println("Broj "+ x + " se nalazi u nizu");
		
		
		
		}
	//sortiranje
	
		public static void sortiranje (int [] o) {
			int temp;
			for(int e=0;e<o.length-1;e++) {
				if (o[e] > o[e+1]) {
					temp= o[e+1];
					o[e+1]=o[e];
					o[e]=temp;		
						}
						
				
			}
			
		}
		public static int provera(int [] q, int d) {
			int prom=0;
			for(int l =0; l< q.length-1;l++)
			{ if (q[l]==d) prom++;
			}
			return prom;
			}
				
			
		}

		
