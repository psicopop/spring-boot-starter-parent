package com.spring.boot.spring_boot_starter_parent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.spring_boot_starter_parent.model.NewProduct;
import com.spring.boot.spring_boot_starter_parent.repository.NewProductRepository;

import jakarta.transaction.Transactional;

@Service
public class NewProductService {


  @Autowired
  private NewProductRepository repository;

  public List<NewProduct> findAll() {
    return this.repository.findAll();
  }

  public NewProduct findById(Long id) {
    return this.repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
  }

  public NewProduct save(NewProduct produto) {
    return this.repository.save(produto);
  }

  @Transactional
  public void delete(Long id) {
    this.repository.deleteById(id);
  }

}
