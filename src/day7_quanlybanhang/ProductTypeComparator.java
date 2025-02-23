package day7_quanlybanhang;

import java.util.Comparator;

public class ProductTypeComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
	return p2.getProductType().compareTo(p1.getProductType());
	}
}


