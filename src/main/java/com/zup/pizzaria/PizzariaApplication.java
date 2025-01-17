package com.zup.pizzaria;

import com.zup.pizzaria.controllers.PagamentoController;
import com.zup.pizzaria.models.Pagamento;
import com.zup.pizzaria.services.PagamentoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);
	}

}
