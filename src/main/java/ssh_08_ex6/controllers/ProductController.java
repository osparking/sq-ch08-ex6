package ssh_08_ex6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.AllArgsConstructor;
import ssh_08_ex6.model.Product;
import ssh_08_ex6.services.ProductService;

@Controller
@AllArgsConstructor
public class ProductController {
	private final ProductService service;
	
	@GetMapping("/products")
	public String showProducts(Model model) {
		var products = service.getProducts();
		model.addAttribute("products", products);
		
		return "products.html";
	}
	
	@PostMapping("/products")
	public String addProduct(Product product, Model model) {
		service.addProduct(product);
		model.addAttribute("products", service.getProducts());
		
		return "products.html";
	}
	

}
