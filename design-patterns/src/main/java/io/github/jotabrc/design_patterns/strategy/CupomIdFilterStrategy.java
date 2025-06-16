package io.github.jotabrc.design_patterns.strategy;

import io.github.jotabrc.design_patterns.observer.Cupom;

import java.util.Optional;

public class CupomIdFilterStrategy implements FilterStrategy<Cupom, Long> {

    @Override
    public Optional<Cupom> filter(String valor, Repository<Cupom, Long> repository) {
        try {
            Long valorNumerico = Long.parseLong(valor);
            return repository.findById(valorNumerico);
        } catch (NumberFormatException e) {
            // log...
            return Optional.empty();
        }
    }
}
