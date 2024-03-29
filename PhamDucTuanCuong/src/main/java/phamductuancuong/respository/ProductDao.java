package phamductuancuong.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import phamductuancuong.entity.Product;
@Repository
public interface ProductDao {
	public List<Product> findAll();
	public Product save(Product product);
	public Product findProductById(int id);
	public String delete(int id);
}
