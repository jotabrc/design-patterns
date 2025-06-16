package io.github.jotabrc.design_patterns.observer;

import io.github.jotabrc.design_patterns.factory_method.DocumentoFactory;
import io.github.jotabrc.design_patterns.factory_method.NotaFiscal;
import io.github.jotabrc.design_patterns.util.TipoDeDocumento;
import lombok.AllArgsConstructor;

import java.util.List;

public class CupomServiceImpl implements CupomService {

    private final List<Observador> observadores;

    public CupomServiceImpl(List<Observador> observadores) {
        this.observadores = observadores;
    }

    @Override
    public void salvar(Cupom cupom) {
        System.out.println("Salvando cupom...");
        observadores.forEach(observador -> observador.enviarEvento(cupom));
    }
}
