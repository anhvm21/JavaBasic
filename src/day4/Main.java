package day3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			String s1=sc.next();
			int x=sc.nextInt();
			System.out.printf("%-15s%03d%n",s1,x);
		}
		System.out.println("================================");
		
	}
	
	public static void printString() {
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");
	}
	
	public static void printInteger() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void printMutipleVariables() {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.nextLine(); 
		s = scan.nextLine();
		scan.close();
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
