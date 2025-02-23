package day7_quanlybanhang;

public class Product {
private String productId;
private String productName;
private String productType;
private double productPrice;

public void addProduct(String id, String name, String type, double price) {
productId = id;
productName = name;
productType = type;
productPrice = price;
}

public String getProductId() {
	return productId;
}

public String getProductName() {
	return productName;
}

public String getProductType() {
	return productType;
}

public double getProductPrice() {
	return productPrice;
}
}
