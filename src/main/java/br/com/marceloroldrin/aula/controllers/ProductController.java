package br.com.marceloroldrin.aula.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marceloroldrin.aula.model.entities.Product;
import br.com.marceloroldrin.aula.model.repositories.ProductRepository;

@RestController
@RequestMapping("product")
public class ProductController extends GenericController<Product, Long, ProductRepository>{
    
}
