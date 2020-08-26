package br.com.alura.thread;

import br.com.alura.service.BanheiroService;

public class LiquidoTask implements Runnable {

    private BanheiroService banheiroService;

    public LiquidoTask(BanheiroService banheiroService) {
        this.banheiroService = banheiroService;
    }

    public void run() {
        banheiroService.pipi();
    }
}
