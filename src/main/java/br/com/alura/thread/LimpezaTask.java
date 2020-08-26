package br.com.alura.thread;

import br.com.alura.service.BanheiroService;

public class LimpezaTask implements Runnable {

    private BanheiroService banheiroService;

    public LimpezaTask(BanheiroService banheiroService) {
        this.banheiroService = banheiroService;
    }

    public void run() {
        banheiroService.limpar();
    }
}
