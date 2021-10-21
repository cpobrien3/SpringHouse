package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class SpringHouseApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHouseApplication.class, args);

	}
	
	@Autowired
	HouseRepository repo;

	@Override
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House d = new House(2, 3, "555 Maple Drive", 95000.99);
		House c = new House(4, 5, "678 South Ave", 75000.50);
		repo.save(d);
		repo.save(c);
		List<House> allMyHouses = repo.findAll();
				
		for(House houses: allMyHouses) {
			System.out.println(houses.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
	
	
}
