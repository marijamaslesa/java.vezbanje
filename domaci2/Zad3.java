package domaci2;

import java.util.Random;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);

		int a,b,c;
		
		Random rand = new Random();
		b= rand.nextInt(51);
		
		
	do {
		System.out.println("Unesite jedan ceo broj");
		a = sc.nextInt();
	    c =provera (a,b);
	if (c==0) System.out.println("Neverovatno! Pogodili ste tacan broj! Pogodjeni broj je " + a);
	if(c==1) System.out.println("Dobar pokusaj, bili ste jako blizu!");
	}
	while (c!=0);
	
		
	}
		public static int provera (int x, int y) {
			if (x==y) {
				return 0; }
		    if (Math.abs(x-y) <= 5  ) { 
                return 1; }
		    else return 2;
				
			}
		}

	


