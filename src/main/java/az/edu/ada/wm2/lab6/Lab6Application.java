package az.edu.ada.wm2.lab6;

import az.edu.ada.wm2.lab6.model.Category;
import az.edu.ada.wm2.lab6.model.Product;
import az.edu.ada.wm2.lab6.repository.CategoryRepository;
import az.edu.ada.wm2.lab6.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Lab6Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab6Application.class, args);
	}

	@Bean
	CommandLineRunner loadData(ProductRepository productRepository, CategoryRepository categoryRepository) {
		return args -> {

			// Create categories
			Category electronics = new Category("Electronics");
			Category food = new Category("Food");

			categoryRepository.saveAll(List.of(electronics, food));

			// Create products and assign categories
			Product laptop = Product.builder()
					.productName("Laptop")
					.price(new BigDecimal("1200"))
					.expirationDate(LocalDate.now().plusYears(1))
					.categories(List.of(electronics))
					.build();

			Product cheese = Product.builder()
					.productName("Cheese")
					.price(new BigDecimal("15"))
					.expirationDate(LocalDate.now().plusMonths(6))
					.categories(List.of(food))
					.build();

			productRepository.save(laptop);
			productRepository.save(cheese);
		};
	}
}