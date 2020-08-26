package br.com.alura.thread;

import java.util.List;
import java.util.TreeMap;

public class AdicionarListaTask implements Runnable {

    private int totalThread;
    private int totalItens;
    private final List<String> lista;

    public AdicionarListaTask(int totalThread, int totalItens, List<String> lista) {
        this.totalThread = totalThread;
        this.totalItens = totalItens;
        this.lista = lista;
    }

    public void run() {
        synchronized (lista) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < this.totalItens; i++) {
                System.out.println("#ADICIONANDO: " + Thread.currentThread().getName() + "/" + i);
                lista.add(Thread.currentThread().getName() + "/" + i);
            }

            if (lista.size() == (this.totalThread * this.totalItens)) {
                lista.notify();
            }
        }
    }
}
