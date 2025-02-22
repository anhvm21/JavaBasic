package day5;

import java.util.Scanner;

public class Method3 {
	public static boolean hasEight(int a) {
		a = Math.abs(a);

		while (a > 0) {
			if (a % 10 == 8) {
				return true;
			}
			a = a / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int magicSum =0;
		
		while(true) {
			System.out.println("Enter a positive integer or -1 to exit: ");
			int a = scan.nextInt();
			
			if(a == -1) {
				break;
			}
			
			if(a<0) {
				System.out.println("Invalid output. Please enter a positive integer or -1 to exit: ");
				continue;
			}
			
			if(hasEight(a))
			magicSum = a+a;
}
		System.out.println("Magic Sum is: " + magicSum);
		scan.close();
}
}
