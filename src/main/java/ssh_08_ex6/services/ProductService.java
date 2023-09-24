package ssh_08_ex6.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ssh_08_ex6.model.Product;

@Service
public class ProductService {
	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

}
