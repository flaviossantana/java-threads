package br.com.alura.thread;

import java.util.List;

public class AdicionarListaTask implements Runnable {

    private List<String> lista;

    public AdicionarListaTask(List<String> lista) {
        this.lista = lista;
    }

    public void run() {
        for (int i = 0; i < 100; i++){
            lista.add(Thread.currentThread().getName() +"/"+ i);
        }
    }
}
