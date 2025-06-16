package io.github.jotabrc.design_patterns.strategy;

import io.github.jotabrc.design_patterns.observer.Cupom;

public class CupomProcessadorImpl implements CupomProcessador {

    @Override
    public FilterStrategy<Cupom, Long> process(TipoDeFilter tipoDeFilter) {
        return switch (tipoDeFilter) {
            case ID -> new CupomIdFilterStrategy();
            case UUID -> new CupomUuidFilterStrategy();
            default -> throw new IllegalStateException("Tipo de filtro (%s) não suportado".formatted(tipoDeFilter));
        };
    }
}
