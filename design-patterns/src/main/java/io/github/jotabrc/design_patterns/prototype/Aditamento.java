package io.github.jotabrc.design_patterns.prototype;

public class Aditamento implements DocumentoPrototype {

    private final long id;

    public Aditamento(long id) {
        this.id = id;
    }

    @Override
    public DocumentoPrototype clonar() {
        return new Aditamento(this.id);
    }
}
