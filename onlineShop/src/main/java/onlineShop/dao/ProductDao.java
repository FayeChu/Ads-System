package onlineShop.dao;

import onlineShop.model.Product;

public interface ProductDao {
	void addProduct(Product product);
	void deleteProduct(int productId);
	void updateProduct(Product product);
	Product getProductById(int productId);
}
