package io.github.jotabrc.design_patterns.observer;

import java.util.List;

public class EventoServiceImpl implements EventoService {

    @Override
    public void enviarEvento(Cupom cupom) {
        System.out.println("Enviando envento após gerar o cupom");
    }
}
