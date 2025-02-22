package day5;

import java.util.ArrayList;

public class Loop {
	public static void main(String[] args) {
		inDanhSach();
	}
	public static void inDanhSach() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Hà");
		l.add("Yến");
		l.add("Phương");
		for (String ten : l) {
			System.out.print(ten + " ");
		}
	}
}
