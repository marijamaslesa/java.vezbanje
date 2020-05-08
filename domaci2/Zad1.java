package domaci2;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a,b;
		System.out.println("unesi br a");
		a= sc.nextInt();
		System.out.println("unesi br b");
		b=sc.nextInt();
		
		while(a<b) {
			if(a%2==0) { System.out.println(a); }
			a++;
		}
			
		}
	}


