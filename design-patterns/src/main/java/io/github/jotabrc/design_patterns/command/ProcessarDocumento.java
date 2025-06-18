package io.github.jotabrc.design_patterns.command;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessarDocumento {

    private Queue<Comando> filaDeComandos = new LinkedList<>();

    public void adicionarComando(Comando comando) {
        filaDeComandos.add(comando);
    }

    public void executarTodosOsComandos() {
        while (!filaDeComandos.isEmpty()) {
            Comando proximoParaExecutar = filaDeComandos.poll();
            proximoParaExecutar.executar();
        }
    }
}
