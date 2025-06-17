package io.github.jotabrc.design_patterns.chain_of_responsability;

import io.github.jotabrc.design_patterns.factory_method.NotaFiscal;

public class ValidaNumero extends ValidadorNotaFiscal {

    @Override
    protected void verificar(NotaFiscal notaFiscal) {
        // ...
        System.out.println("Validando");
    }
}
