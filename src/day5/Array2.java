package day5;

public class Array2 {
	public static void main(String[] args) {
		printArray(null);
	}

	public static void printArray(int[] array) {

		if (array.length > 0) {
			System.out.println("{");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i] + ",");
			}
			System.out.println("}");
		} else {
			System.out.println("Mảng chưa có phần tử nào");
		}
	}
}
