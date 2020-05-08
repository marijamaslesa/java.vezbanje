package domaci1;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
		char operacija;
		double k,a,b,c;
		Scanner sc= new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		operacija = sc.next().charAt(0);
		
		switch(operacija){	
		
			case 's' :
				c=a+b;
				System.out.println(c);
				break;
			case 'o' :
				c=a-b;
				System.out.println(c);
				break;
			case 'm' :
				c=a*b;
				System.out.println(c);
				break;
			case 'd' :
				if(b!=0) {
					k=a/b;
					System.out.println(k);
					
				}
				else System.out.println("greska");
				break;
			default : System.out.println("operacija ne postoji");
				
				
		
		
	
		
		}

	}

}
