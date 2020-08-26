package br.com.alura.thread;

import br.com.alura.service.Banheiro;

public class SolidoTask implements Runnable {

    private Banheiro banheiro;

    public SolidoTask(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    public void run() {
        banheiro.popo();
    }
}
