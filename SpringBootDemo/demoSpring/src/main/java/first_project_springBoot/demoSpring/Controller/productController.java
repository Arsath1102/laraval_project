package first_project_springBoot.demoSpring.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import first_project_springBoot.demoSpring.model.Product;
import first_project_springBoot.demoSpring.respository.ProductRepository;
import first_project_springBoot.demoSpring.services.ProductServices;

@RestController
@RequestMapping("/product")
public class productController {
	
	@Autowired
	private ProductServices productServices;
	
	@GetMapping
	public  List<Product> getaAllproduct(){
		return productServices.getaAllproduct();
		
	}
	
		
	}


