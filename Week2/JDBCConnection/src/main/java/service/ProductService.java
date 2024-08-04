package service;

import java.util.List;

import dao.ProductDAOClass;
import dto.ProductRequest;
import dto.ProductResponse;

public class ProductService {
	private final ProductDAOClass productDao;
	public ProductService(){
		productDao=new ProductDAOClass();
		
	}
public ProductResponse getProductById(long ProductId) {
		
		return productDao.getProductById(ProductId);
	}
	
	public boolean createProduct(ProductRequest productRequest) {
		return productDao.createProduct(productRequest);
	}
	
	public List<ProductResponse> getAllProducts(){
		return productDao.getAllProducts();
	}
	
	public static void main(String[] args) {
		ProductService p = new ProductService();
//         List<ProductResponse> products = p.getAllProducts();
//		
//		for(ProductResponse product: products) {
//			System.out.println(product.toString());
//		}
		
		System.out.println(p.getProductById(1).toString());
		
	
}
}
