package day7_quanlybanhang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyBanHang {
	public ArrayList<Product> inputProduct() {
		Product gaRan = new Product();
		Product gaSot = new Product();
		Product tomBurger = new Product();
		Product khuyenMai1 = new Product();
		Product khuyenMai2 = new Product();

		gaRan.addProduct("G01", "Gà rán phần", "Khuyến Mãi", 87000);
		gaSot.addProduct("G02", "Gà sốt", "Best Seller", 95000);
		tomBurger.addProduct("T01", "Tôm Burger", "Best Seller", 82000);
		khuyenMai1.addProduct("K01", "Combo 1", "Khuyến Mãi", 59000);
		khuyenMai2.addProduct("K02", "Combo 2", "Khuyến Mãi", 59000);

		ArrayList<Product> products = new ArrayList<Product>();
		products.add(gaRan);
		products.add(gaSot);
		products.add(tomBurger);
		products.add(khuyenMai1);
		products.add(khuyenMai2);
		
		return products;
	}
	
	public void displayProduct(ArrayList<Product> products) {

		System.out.printf("%-15s %-15s %-15s %-15s\n", "Mã sản phẩm ", "Tên sản phẩm ", "Loại sản phẩm",
				"Giá sản phẩm");
		for (Product p : products) {
			System.out.printf("%-15s %-15s %-15s %-15s\n", p.getProductId(), p.getProductName(), p.getProductType(),
					p.getProductPrice());
		}
	}

	public static void displayCustomer(ArrayList<Customer> customers) {
		Customer khach1 = new Customer();
		Customer khach2 = new Customer();
		Customer khach3 = new Customer();

		khach1.addCustomer("KH01", "Nguyễn Văn A", "128A phố Khâm Thiên, Đống Đa, HN");
		khach2.addCustomer("KH02", "Lê Thị B", "11A2 Q1, TPHCM");
		khach3.addCustomer("KH03", "Trần Văn C", "Gò Vấp");

	//	ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(khach1);
		customers.add(khach2);
		customers.add(khach3);

	//	displayCustomer(customers);
		
		System.out.printf("%-15s %-15s %-20s\n", "Mã khách hàng", "Tên khách hàng", "Địa chỉ khách hàng");
		for (Customer c : customers) {
			System.out.printf("%-15s %-15s %-20s\n", c.getCustomerId(), c.getCustomerName(), c.getCustomerAddress());
		}
	}
	
	public ArrayList<Product> sortBy(ArrayList<Product> products, String sortedCriteria) {
		ArrayList<Product> sortedProducts = new ArrayList<Product>();
		//List<Product> convertedProducts = products;
		if(sortedCriteria.equalsIgnoreCase("Type")) {
			ProductTypeComparator productTypeCom = new ProductTypeComparator();
			
		Collections.sort(products, productTypeCom);
		displayProduct(products);
		}
		return sortedProducts;
	}
	
}
