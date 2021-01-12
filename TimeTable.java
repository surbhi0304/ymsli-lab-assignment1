package day1assignments;

public class TimeTable {
	public static void main(String args[]) {
		int row = 9;
		int column = 9;
		System.out.println("* | 1 2 3 4 5 6 7 8 9");
		System.out.println("---------------------");
		for (int i = 1; i <= row; i++) {
			System.out.print(i +" | ");
			for (int j = 1; j <= column; j++) {
				System.out.print(i*j+ " ");

			}
			System.out.println("");
		}
	}

}
