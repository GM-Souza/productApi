package com.github.gm_souza.produtosApi.repository;

import com.github.gm_souza.produtosApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
