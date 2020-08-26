package br.com.alura.thread;

import br.com.alura.service.Banheiro;

public class LiquidoTask implements Runnable {


    private String nome;
    private Banheiro banheiro;

    public LiquidoTask(String nome, Banheiro banheiro) {
        this.nome = nome;
        this.banheiro = banheiro;
    }

    public void run() {
        banheiro.urinar(nome);
    }
}
