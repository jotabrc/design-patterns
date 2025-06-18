package io.github.jotabrc.design_patterns.abstract_factory;

import io.github.jotabrc.design_patterns.factory_method.Documento;
import io.github.jotabrc.design_patterns.factory_method.DocumentoFactory;
import io.github.jotabrc.design_patterns.util.TipoDeDocumento;

public class GeradorDeDocumentos implements DocumentoFactoryAbstrato {

    @Override
    public Documento gerarNotaFiscal() {
        return DocumentoFactory.criarDocumento(TipoDeDocumento.NF);
    }

    @Override
    public Documento gerarCupom() {
        return DocumentoFactory.criarDocumento(TipoDeDocumento.CUPOM);
    }
}
