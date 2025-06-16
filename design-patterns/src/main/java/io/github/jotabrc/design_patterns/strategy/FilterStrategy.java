package io.github.jotabrc.design_patterns.strategy;

import java.util.Optional;

public interface FilterStrategy<T, K> {

    Optional<T> filter(String valor, Repository<T, K> repository);
}
