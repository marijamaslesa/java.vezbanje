package domaci2;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		
		
		char operacija;
		double k,a,b,c;
		Scanner sc= new Scanner (System.in);
		
		
	loop :	while (true) {
			System.out.println("Unesite prvi broj");
			a=sc.nextDouble();
			System.out.println("Unesite drugi broj");
			b=sc.nextDouble();
			System.out.println("Unesite operaciju");
			operacija = sc.next().charAt(0);
			
		switch (operacija) {
			case 's' :
				c= zbir(a,b);
				System.out.println("Zbir je " + c);
			    break;
			case 'o' :
				c=razlika(a,b);
				System.out.println("Razlika je " + c);
				break;
			case 'm' :
				c=proizvod (a,b);
				System.out.println("Proizvod je" + c);
				break;
			case 'd' :
				if(b!=0) {
					k=kolicnik(a,b);
					System.out.println("Kolicnik je " + k);
					
				}
				else System.out.println("greska");
				break;
			default : System.out.println("operacija ne postoji"); 
			break loop;
			
		}
			
		}}
			public static double zbir (double x,double y) {
				double z;
				z= x+y;
				return z;
			}
			public static double razlika (double x,double y) {
				double z;
				z= x-y;
				return z;
			}
			public static double proizvod (double x,double y) {
				double z;
				z= x * y;
				return z;
			}
			public static double kolicnik (double x,double y) {
				double z;
				z= x / y;
				return z;
				
			}
				
				

	}


