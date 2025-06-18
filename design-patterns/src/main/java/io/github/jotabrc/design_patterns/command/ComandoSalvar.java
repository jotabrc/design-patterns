package io.github.jotabrc.design_patterns.command;

public class ComandoSalvar implements Comando {

    private final Processo processo;
    private final ProcessoRepository processoRepository;

    public ComandoSalvar(Processo processo, ProcessoRepository processoRepository) {
        this.processo = processo;
        this.processoRepository = processoRepository;
    }

    @Override
    public void executar() {
        processoRepository.save(processo);
    }
}
