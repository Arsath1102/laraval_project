package first_project_springBoot.demoSpring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import first_project_springBoot.demoSpring.model.Product;
import first_project_springBoot.demoSpring.respository.ProductRepository;

@Component
public class dataSeeder implements CommandLineRunner {
	
	@Autowired 
	ProductRepository productRepository;
	@Override
	public void run(String ...args) throws Exception{
		if(productRepository.count()==0) {
			List<Product> products=Arrays.asList(new Product("opps fz 13 11th gen ", 12000,"this mobile is so amzing",12.5,"amazon","null",10, 20),
					new Product("null",1000, "null", 12, "null", "null", 1, 6));
			productRepository.saveAll(products);
			System.out.println("data connected sussfully ");
		}
	}
	

}
