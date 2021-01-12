package day1assignments;

import java.util.*;

public class GradesAverage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Students: ");
		int numberOfStudents = sc.nextInt();
		float marks[] = new float[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter the grade for student " + (i + 1));
			float checker = sc.nextFloat();
			if (checker < 0 || checker > 100) {
				--i;
				System.out.println("invalid grade, try again...");
			} else {
				marks[i] = checker;
			}
		}
		float sum = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			sum = sum + marks[i];
		}
		float average =sum/numberOfStudents;
		System.out.println("The Average is: " + average);
		sc.close();
	}
}