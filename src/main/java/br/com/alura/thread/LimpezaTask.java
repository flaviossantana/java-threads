package br.com.alura.thread;

import br.com.alura.service.BanheiroService;

public class LimpezaTask implements Runnable {

    private BanheiroService banheiroService;

    public LimpezaTask(BanheiroService banheiroService) {
        this.banheiroService = banheiroService;
    }

    public void run() {
        while (true){
            banheiroService.limpar();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
