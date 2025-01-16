package com.github.gm_souza.produtosApi.controller;

import com.github.gm_souza.produtosApi.model.Product;
import com.github.gm_souza.produtosApi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product salvar(@RequestBody Product product){

        System.out.println("Produto recebido: "+product);
        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }
    @GetMapping("/{id}")
    public Product obterPorId(@PathVariable("id") String id){
        Optional<Product> product = productRepository.findById(id);
        return product.isPresent() ? product.get() : null;


    }
}
