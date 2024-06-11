package com.spring.boot.spring_boot_starter_parent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.spring_boot_starter_parent.model.NewProduct;

@Repository
public interface NewProductRepository extends JpaRepository<NewProduct, Long>{

}
