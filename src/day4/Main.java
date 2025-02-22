package day4;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		checkerBoard();
}


	//A. Data Types and Variables
	//1
	public static void printString() {
		System.out.println("Hello World.");
	}
	
	//2
	public static void printSpecialCharacters() {
		System.out.println("++++++");
		System.out.println("@@@@@@");
		System.out.println("******");
		System.out.println("######");
	}
	
	//3
	public static void printMultipleVariables() {
		Scanner scan = new Scanner(System.in);
		int a = 10;
		double b = 20.3;
		double c = 3.14785;
		scan.close();
		
		System.out.println("Value of a:" + a);
		System.out.println("Value of b:" + b);
		System.out.println("Value of c:" + c);
	}
	
	//4
	public static void printBooleanValue() {
		boolean value = true;
		
		value = false;
		System.out.print("Value of boolean:" + value);
	}
	
	//6
	public static void printCalcius() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		double calcius = (( 5 *(fahrenheit - 32.0)) / 9.0);
		scan.close();
						
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + calcius + " in Calcius");
	}
	
	//7
	public static void printMeters() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a value for inch: ");
		double inch = scan.nextDouble();
		double meter = (inch*0.0254);
		scan.close();
						
		System.out.println(inch + " inch is " + meter + " meters");
	}
	
	//B. Operators
	//2
	public static void printSpeed() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input distance in meters: ");
		double meters = scan.nextDouble();
		
		System.out.print("Input hour: ");
		double hour = scan.nextDouble();
		
		System.out.print("Input minutes: ");
		double minutes = scan.nextDouble();
		
		System.out.print("Input seconds: ");
		double seconds = scan.nextDouble();
		scan.close();
		
		double ms = (meters/(seconds+hour*3600+minutes*60));
		double kmh = (meters*0.001/(hour+minutes/60));
		double milesh = ((meters/1609)/(hour+minutes/60));
		
		System.out.println("Your speed in meters/second is: " + ms );
		System.out.println("Your speed in km/h is: " + kmh);
		System.out.println("Your speed in miles/h is: " + milesh);
	}
	
	//3
	public static void printInts() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input 1st integer: ");
		int a = scan.nextInt();
		
		System.out.print("Input 2nd integer: ");
		int b = scan.nextInt();
		scan.close();
		
		int sum = (a+b);
		int diff = (a-b);
		int prod = (a*b);
		double avg = (sum/2);
		int dist = Math.abs(a-b);
		
		System.out.println("Sum of two integers: " + sum );
		System.out.println("Difference of two integers: " + diff);
		System.out.println("Product of two integers: " + prod);
		System.out.println("Average of two integers: " + avg);
		System.out.println("Distance of two integers: " + dist);
		
		if (a>b) {
			System.out.println("Max integer: " + a);
			System.out.println("Min integer: " + b);
		}
		else {
			System.out.println("Max integer: " + b);
			System.out.println("Min integer: " + a);
		}
	}
	
	//4
	public static void printDigits() {
		Scanner scan = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        int a = scan.nextInt();
        
        String s = Integer.toString(a);
        for (char digit : s.toCharArray()) {
        System.out.print(digit + " ");
            
        scan.close();
        }
	}
	
	//C. Decision Making
	//1
	public static void printSumDigits() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000: ");
		int in = scan.nextInt();
		scan.close();
		
		int a = in%10; 
		int b = (in/10)%10;
		int c = (in/100)%10;

		int sum = a + b + c;
		System.out.println("The sum of all digits in " + in + " is " + sum);
	}
	
	//2
	public static void printYearandDays() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		int minutes = scan.nextInt();
		
		int year = (minutes/525600);
		int remainingminutes = ((year+1)*525600)-minutes;
		int days = 365-(remainingminutes/(24*60));
		scan.close();
		
		System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days"); 
	}
	
	//***************************
	//A. Loops
	//1
	public void SumAndAvg() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum+i;
		}
		System.out.println("The sum is: " + sum);
		
		double avg = (sum/100.0);
		System.out.println("The average is: " + avg);
	}
	
	//2
	public void SumAndAvg2() {
		int sum = 0;
		int count = 0;
		for(int i=111; i<=8899; i++) {
			sum = sum + i;
			count ++;
		}
		System.out.println("The sum is " + sum);
		
		double avg = (double)sum/(double) count;
		System.out.println("The average is " + avg);
	}
	
	//3
	public void SumAndAvg3() {
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 100; i++){
			if (i%2==1) {
				sum = sum+i;
				count++;
			}
		}
		System.out.println("The sum is " + sum);
		
		double avg = (double)sum/(double)count;
		System.out.println("The average is " + avg);
	}
	
	//4
	public void SumAndAvg4() {
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%7==0) {
				sum = sum + i;
				count++;
			}
		}
		
		double avg = (double)sum/(double)count;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
	}
	
	//5
	public void SumOfSquares() {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum+i*i;
		}
		
		System.out.println("Sum of the squares is " + sum);
	}
	
	//6 
	public static void Sum6() {
		double sum1=0.0;
		double sum2=0.0;
		int n =50000;
		for(int i=1; i<=n; i++) {
			sum1=(double)sum1+(double)1.0/i;
		}
		for(int j=50000; j>=1; j--) {
			sum2=(double)1.0/j+(double)sum2;
		}
		System.out.println("Harmonic(n) = " +sum1);
		System.out.println("Harmonic(n) = " +sum2);
	}
	
	//7
	public static void squareBoard() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	//8
	public static void checkerBoard() {
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				if(i%2==1) {
					System.out.print("# ");
				}
				else {
					System.out.print(" #");
				}
			}
			System.out.println();
		}
	}
}