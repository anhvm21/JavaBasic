package day5;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int numStudents = scan.nextInt();

		int grades[] = new int[numStudents];
		int sum = 0;

		for (int i = 0; i < numStudents; i++) {
			while (true) {
				System.out.println("Enter the grade for student" + (i + 1) + ": ");
				int grade = scan.nextInt();

				if (grade >= 0 && grade <= 100) {
					grades[i] = grade;
					sum += grade;
					break;
				} else {
					System.out.println("Invalid grade, try again...");
				}
			}
		}
		double avg = (double)sum/numStudents;
		System.out.println("The average is: " + avg);
	}
}
