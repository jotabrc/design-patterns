package io.github.jotabrc.design_patterns.observer;

import io.github.jotabrc.design_patterns.factory_method.Documento;

public class Cupom implements Documento {

    @Override
    public void gerar() {
        System.out.println("Cupom criado...");
    }
}
