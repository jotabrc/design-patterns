package io.github.jotabrc.design_patterns.strategy;

import io.github.jotabrc.design_patterns.observer.Cupom;

public interface CupomProcessador {

    FilterStrategy<Cupom, Long> process(TipoDeFilter tipoDeFilter);
}
