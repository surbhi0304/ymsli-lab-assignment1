package day1assignments;

public class Fibonnaci {
	public static void main(String args[]) {
		int number = 20;
		int fibonnaci1 = 1;
		int fibonnaci2 = 1;
		int fibonnaci;
		int sum = fibonnaci1 + fibonnaci2;
		System.out.print(fibonnaci1 + " " + fibonnaci2 + " ");
		for (int i = 3; i <= number; i++) {
			fibonnaci = fibonnaci1 + fibonnaci2;
			sum = sum + fibonnaci;
			System.out.print(fibonnaci + " ");
			fibonnaci1 = fibonnaci2;
			fibonnaci2 = fibonnaci;
		}
		int average = sum / number;
		System.out.println("");
		System.out.println("The average is: " + average);
	}

}
