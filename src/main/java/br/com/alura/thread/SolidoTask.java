package br.com.alura.thread;

import br.com.alura.service.BanheiroService;

public class SolidoTask implements Runnable {

    private BanheiroService banheiroService;

    public SolidoTask(BanheiroService banheiroService) {
        this.banheiroService = banheiroService;
    }

    public void run() {
        banheiroService.popo();
    }
}
