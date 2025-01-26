package com.entity.mapping.JPAEntityMappping;

import com.entity.mapping.JPAEntityMappping.entity.Customer;
import com.entity.mapping.JPAEntityMappping.entity.Items;
import com.entity.mapping.JPAEntityMappping.repository.CustomerRepository;
import com.entity.mapping.JPAEntityMappping.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaEntityMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaEntityMappingApplication.class, args);
	}

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer("Tom");
		Items items = new Items("pen");
		customer.setItems(items);
		//itemRepository.save(items);  this will not required for cascade all property
		customerRepository.save(customer);
	}

	/*
	mysql>
mysql> select * from items;
+----+------+
| id | name |
+----+------+
|  1 | pen  |
+----+------+
1 row in set (0.00 sec)

mysql> select * from customer;
+----+----------+------+
| id | items_id | name |
+----+----------+------+
|  1 |        1 | Tom  |
+----+----------+------+
1 row in set (0.00 sec)

mysql>
	* */
}
