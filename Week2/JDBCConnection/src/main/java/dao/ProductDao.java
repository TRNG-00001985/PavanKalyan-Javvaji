package dao;

import java.util.List;

import dto.ProductRequest;
import dto.ProductResponse;

public interface ProductDao {
	ProductResponse getProductById(long ProductId);
	boolean createProduct(ProductRequest productRequest);
	boolean updateProduct(ProductResponse productResponse);
	boolean deleteProduct(long ProductId);
	List<ProductResponse> getAllProducts();

}
