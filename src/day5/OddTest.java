package day5;

import java.util.Scanner;

//B.Method
//1
public class OddTest {

	public static boolean isOdd(int a) {
		if(a < 0) {
			System.out.println("Please enter number > 0");
			return false;
		}
		return a % 2 != 0;
	}	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = scan.nextInt();
		
		if (a<0) {
	            } else if (isOdd(a)) {
	            	System.out.println("ODD");
	            }
	            else {
	            	System.out.println("EVEN");
	            }
      scan.close();
	}
}