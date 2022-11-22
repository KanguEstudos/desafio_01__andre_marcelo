package br.com.desafioecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioecommerce.model.entities.Product;
import br.com.desafioecommerce.model.repositories.ProductRepository;

@RestController
@RequestMapping("product")
public class ProductController extends GenericController<Product, Long, ProductRepository>{
    
    @GetMapping("/sonome")
    public Iterable<Product> soNome(){
        return super.jpaRepository.search();
    }
}
