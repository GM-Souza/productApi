package com.github.gm_souza.produtosApi.controller;

import com.github.gm_souza.produtosApi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public void salvar(@RequestBody Product product){
        System.out.println("Produto recebido: "+product);
    }
}
