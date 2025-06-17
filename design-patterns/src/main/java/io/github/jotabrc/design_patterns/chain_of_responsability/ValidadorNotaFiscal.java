package io.github.jotabrc.design_patterns.chain_of_responsability;

import io.github.jotabrc.design_patterns.factory_method.NotaFiscal;

/**
 * ValidadorNotaFiscal validadorNotaFiscal = new ValidaNumero();
 * validadorNotaFiscal<br>
 * .proximo(new ValidaNumero())<br>
 * .proximo(new ValidaNumero());
 * <p>
 * validadorNotaFiscal.validar(new NotaFiscal());
 */
public abstract class ValidadorNotaFiscal {

    protected ValidadorNotaFiscal proximaValidacao;

    public ValidadorNotaFiscal proximo(ValidadorNotaFiscal validadorNotaFiscal) {
        this.proximaValidacao = validadorNotaFiscal;
        return proximaValidacao;
    }

    public void validar(NotaFiscal notaFiscal) {
        verificar(notaFiscal);
        if (proximaValidacao != null) proximaValidacao.validar(notaFiscal);
    }

    protected abstract void verificar(NotaFiscal notaFiscal);
}
