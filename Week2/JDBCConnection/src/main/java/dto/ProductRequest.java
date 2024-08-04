package dto;

public class ProductRequest {
 private String ProductName;
 private String sku_code;
 private float Price;
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getSku_code() {
	return sku_code;
}
public void setSku_code(String sku_code) {
	this.sku_code = sku_code;
}
public float getPrice() {
	return Price;
}
public void setPrice(float price) {
	Price = price;
}
public ProductRequest(String productName, String sku_code, float price) {
	super();
	ProductName = productName;
	this.sku_code = sku_code;
	Price = price;
}
public String toString() {
	return "ProductRequest [ProductName=" + ProductName + ", sku_code=" + sku_code + ", Price=" + Price + "]";
	
}
}
