package day7_quanlybanhang;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
	return p1.getProductType().compareTo(p2.getProductType());
	}
}
