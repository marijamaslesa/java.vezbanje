package domaci1;

import java.util.Random;
import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		
		 
Scanner sc= new Scanner (System.in);

int a,b,c;
System.out.println("Unesite jedan ceo broj");
a = sc.nextInt();
Random rand = new Random();
b= rand.nextInt(51);
c= a-b;

if (a==b) {
	System.out.println("Neverovatno! Pogodili ste tacan broj!");
	
}

if (c>0) 
{if(c<=5 && c>=1) {System.out.println("blizu");	}
else System.out.println("greska");
}


if (c<0)
{if (c>=-5 && c<=-1) {System.out.println("blizu");}
else System.out.println("greska");
}




	
	
}
	}


