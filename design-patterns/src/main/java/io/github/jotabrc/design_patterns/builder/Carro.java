package io.github.jotabrc.design_patterns.builder;

// @Builder
public class Carro {

    private final String modelo;

    private Carro(CarroBuilder carroBuilder) {
        this.modelo = carroBuilder.modelo;
    }

    public static CarroBuilder builder() {
        return new CarroBuilder();
    }

    public static class CarroBuilder {
        private String modelo;

        private CarroBuilder() {}

        public CarroBuilder nome(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }
}
