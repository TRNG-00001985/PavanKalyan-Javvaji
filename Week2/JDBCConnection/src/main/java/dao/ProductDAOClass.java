package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dto.ProductRequest;
import dto.ProductResponse;
import jdbcutils.ConnectionFactor;

public class ProductDAOClass implements ProductDao{

	@Override
	public ProductResponse getProductById(long ProductId) {
		String sql="SELECT * FROM Product WHERE ProductId=?";
		try(Connection con=ConnectionFactor.getConnectionFactor().getConnection();PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setFloat(1,ProductId);
			try(ResultSet rs=stmt.executeQuery()){
				if(rs.next()) {
					return new ProductResponse (
						rs.getLong("ProductId"),
						rs.getString("ProductName"),
						rs.getString("sku_code"),
						rs.getFloat("Price"));
					}
				}
				
			}
			
		
		catch(SQLException e) {
			e.printStackTrace();
			
			
		}
		
			return null;
		
	}

	@Override
	public boolean createProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(ProductResponse productResponse) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(long ProductId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
        
}
