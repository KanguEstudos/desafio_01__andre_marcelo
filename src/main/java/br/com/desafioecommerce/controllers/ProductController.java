package br.com.desafioecommerce.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioecommerce.model.entities.Product;
import br.com.desafioecommerce.model.repositories.ProductRepository;


@RestController
@RequestMapping("product")
public class ProductController extends GenericController<Product, Long, ProductRepository>{

    @GetMapping(value="/categories")
    public List<String> listCategories() {
        return this.findAll()
            .stream()
            .map(p -> p.getCategory().getName())
            .distinct()
            .toList();
    }

    @GetMapping(value="/find/{name}")
    public List<Product> listCategories(@PathVariable String name) {
        return this.findWhere(
            p -> p.getTitle().toLowerCase().contains(name.toLowerCase())
            );
    }

    @GetMapping(value="/category/{name}")
    public List<Product> listProductsByCategoryName(@PathVariable String name) {
        return this.findWhere(
            p -> p.getCategory()
                .getName()
                .toLowerCase()
                .contains(name.toLowerCase())
            );
    }

    @GetMapping(value="/categoryid/{id}")
    public List<Product> listProductsByCategoryID(@PathVariable Long id) {
        return this.findWhere(p -> p.getCategory().getId() == id);
    }
    
}
