package br.com.alura.thread;

import br.com.alura.service.Banheiro;

public class LiquidoTask implements Runnable {

    private Banheiro banheiro;

    public LiquidoTask(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    public void run() {
        banheiro.pipi();
    }
}
