package com.github.gm_souza.produtosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosApiApplication {

	@GetMapping("/hello-world")
	public String helloWorld(){
		return "hello world!";
	}


	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}

}
