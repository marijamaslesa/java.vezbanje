package domaci2;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

int n,br,p,x=0;
String ime;
String provera = "bez imena";
n= sc.nextInt();
 for(br=1;br<=n;br++) 
 {System.out.println("Unesi ime studenta");
 ime= sc.next();
 System.out.println("Unesi broj poena");
 p= sc.nextInt();
 
  if(p>x) {
 x=p;
 provera = ime;	 
  }
	 
 } 
System.out.println("Student " + provera + " ima najvise poena. Broj poena je " + x + ".");	 
	 


	}

}
