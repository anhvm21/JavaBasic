package day5;

import java.util.Scanner;

public class Method2 {
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
		
		System.out.print("Enter a number: ");
        int a = scan.nextInt();
        
        if(hasEight(a)) {
        	System.out.println("The number contains the digit 8.");
        } else {
        	System.out.println("The number does not contains the digit 8.");
        }
        scan.close();
	}
}
