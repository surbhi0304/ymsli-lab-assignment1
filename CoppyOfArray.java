package day1assignments;

public class CoppyOfArray {
	public static void main(String args[]) {
		int[] temp= {3,4,5,1};
		print(temp);
		int[] temp2= copyOf(temp);
		print(temp2);
		temp2[2]= 9;
		print(temp);
		print(temp2);
		
	}
	
	public static int[] copyOf(int arr[]) {
		int[] temp= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			temp[i]= arr[i];
		}
		return temp;
	}
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
