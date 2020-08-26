package br.com.alura.thread;

import br.com.alura.service.Banheiro;

public class SolidoTask implements Runnable {


    private String nome;
    private Banheiro banheiro;

    public SolidoTask(String nome, Banheiro banheiro) {
        this.nome = nome;
        this.banheiro = banheiro;
    }

    public void run() {
        banheiro.defecar(nome);
    }
}
