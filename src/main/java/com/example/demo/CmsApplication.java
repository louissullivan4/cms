package com.example.demo;

import com.example.demo.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class CmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}

	@GetMapping
	public List<Customer> hello() {
		return List.of(
				new Customer(
						"louis",
						"Sullivan",
						"City A"
				)
		);
	}
}

//Customer louis = new Customer("louis", "Sullivan", "City A");
//Order order1 = new Order("1A", 20.00f, 5.00f, "City C", louis.getAddress());
//ArrayList<Order> louisList = louis.getOrderList();
//louisList.add(order1);
//louisList.add(order1);
//System.out.println(order1.getDeliveryCost());
//louis.printOrderList();