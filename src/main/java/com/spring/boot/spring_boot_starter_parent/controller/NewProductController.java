package com.spring.boot.spring_boot_starter_parent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.spring_boot_starter_parent.model.NewProduct;
import com.spring.boot.spring_boot_starter_parent.service.NewProductService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Tag(name = "Product", description = "Carrinho Product")
@RestController
@RequestMapping("/api/product")
public class NewProductController {
  
  @Autowired
  private NewProductService newProductService;

  @GetMapping("/")
  public List<NewProduct> findAll(){
    return this.newProductService.findAll();
}

@PostMapping("/{id}")
public NewProduct findById(Long id){
  return this.newProductService.findById(id);
}

@PostMapping("/")
    public NewProduct save(NewProduct newProduct){
        return this.newProductService.save(newProduct);
    }

    @PutMapping("/")
    public NewProduct update(NewProduct newProduct){
        return this.newProductService.save(newProduct);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        this.newProductService.delete(id);
    }


    
  
  
}
