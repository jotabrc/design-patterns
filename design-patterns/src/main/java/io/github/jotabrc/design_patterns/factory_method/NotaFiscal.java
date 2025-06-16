package io.github.jotabrc.design_patterns.factory_method;

public class NotaFiscal implements Documento {

    @Override
    public void gerar() {
        System.out.println("NF criada...");
    }
}
