package br.com.alura.thread;

import java.util.List;

public class AdicionarListaTask implements Runnable {

    private List<String> lista;

    public AdicionarListaTask(List<String> lista) {
        this.lista = lista;
    }

    public void run() {

        try {
            synchronized (lista) {
                Thread.sleep(1000);
                for (int i = 0; i < 100; i++) {
                    System.out.println("#ADICIONANDO: " + Thread.currentThread().getName() + "/" + i);
                    lista.add(Thread.currentThread().getName() + "/" + i);
                }

                if (lista.size() == 1000) {
                    lista.notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
