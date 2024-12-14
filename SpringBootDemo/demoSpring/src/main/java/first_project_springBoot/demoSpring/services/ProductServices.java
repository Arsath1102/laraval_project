package first_project_springBoot.demoSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first_project_springBoot.demoSpring.model.Product;
import first_project_springBoot.demoSpring.respository.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getaAllproduct(){
		return productRepository.findAll();
	}

}
