package io.github.jotabrc.design_patterns;

import io.github.jotabrc.design_patterns.builder.Carro;
import io.github.jotabrc.design_patterns.chain_of_responsability.ValidaNumero;
import io.github.jotabrc.design_patterns.chain_of_responsability.ValidadorNotaFiscal;
import io.github.jotabrc.design_patterns.factory_method.NotaFiscal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
