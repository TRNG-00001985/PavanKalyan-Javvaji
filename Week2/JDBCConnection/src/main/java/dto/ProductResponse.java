package dto;

public class ProductResponse {

	
	private long ProductId;
	 private String ProductName;
	 private String sku_code;
	 private float Price;
	public long getProductId() {
		return ProductId;
	}
	public void setProductId(long productId) {
		ProductId = productId;
	}
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
	public ProductResponse(long productId, String productName, String sku_code, float price) {
		super();
		ProductId = productId;
		ProductName = productName;
		this.sku_code = sku_code;
		Price = price;
	}
	
	
	public String toString() {
		return "ProductResponse [ProductId=" + ProductId + ",ProductName=" + ProductName + ", sku_code=" + sku_code + ", Price=" + Price + "]";
		
	}
	
}
