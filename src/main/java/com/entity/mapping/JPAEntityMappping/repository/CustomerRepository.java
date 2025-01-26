package com.entity.mapping.JPAEntityMappping.repository;

import com.entity.mapping.JPAEntityMappping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
