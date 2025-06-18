package io.github.jotabrc.design_patterns.abstract_factory;

import io.github.jotabrc.design_patterns.factory_method.Documento;

public interface DocumentoFactoryAbstrato {

    Documento gerarNotaFiscal();
    Documento gerarCupom();
}
