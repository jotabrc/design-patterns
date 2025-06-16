package io.github.jotabrc.design_patterns.strategy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository<T, K> extends JpaRepository<T, K> {

    Optional<T> findByUuid(String uuid);
}
