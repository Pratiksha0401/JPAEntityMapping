package com.entity.mapping.JPAEntityMappping.repository;

import com.entity.mapping.JPAEntityMappping.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Long> {
}
