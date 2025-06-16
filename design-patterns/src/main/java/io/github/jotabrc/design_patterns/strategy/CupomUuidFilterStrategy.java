package io.github.jotabrc.design_patterns.strategy;

import io.github.jotabrc.design_patterns.observer.Cupom;

import java.util.Optional;

public class CupomUuidFilterStrategy implements FilterStrategy<Cupom, Long> {

    @Override
    public Optional<Cupom> filter(String valor, Repository<Cupom, Long> repository) {
        return repository.findByUuid(valor);
    }
}
