package io.github.jotabrc.design_patterns.factory_method;

import io.github.jotabrc.design_patterns.observer.Cupom;
import io.github.jotabrc.design_patterns.util.TipoDeDocumento;

public class DocumentoFactory {

    public static Documento criarDocumento(TipoDeDocumento tipoDeDocumento) {
        return switch (tipoDeDocumento) {
            case NF -> new NotaFiscal();
            case CUPOM -> new Cupom();
            default -> throw new IllegalStateException("Tipo de documento (%s) não suportado".formatted(tipoDeDocumento));
        };
    }
}
