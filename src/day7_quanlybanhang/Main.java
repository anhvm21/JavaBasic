package day7_quanlybanhang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		displayMenu();
		QuanLyBanHang qlbh = new QuanLyBanHang();
		ArrayList<Product> products = qlbh.inputProduct();
qlbh.sortBy(products, "Type");
	}

	public static void displayMenu() {
		QuanLyBanHang qlbh = new QuanLyBanHang();
		ArrayList<Product> products = qlbh.inputProduct();
		System.out.print("Quản lý bán hàng\n" + "Menu chính\n" + "1. Hiển thị danh sách sản phẩm\n"
				+ "2. Hiển thị danh sách sản phẩm theo loại\n" + "3. Sắp xếp sản phẩm theo giá:\n"
				+ "3.1. Giá tăng dần\n" + "3.2. Giá giảm dần\n" + "User chọn:");
		try (Scanner scan = new Scanner(System.in)) {
			int menuOption = scan.nextInt();

			switch (menuOption) {
			case 1: {
				qlbh.displayProduct(products);
				break;
			}
			case 2: {

			}
			}
		}
	}
}
