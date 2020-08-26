package br.com.alura.thread;

import br.com.alura.core.ListaUtil;

public class AdicionarlistaTask implements Runnable {

    private ListaUtil lista;

    public AdicionarlistaTask(ListaUtil lista) {
        this.lista = lista;
    }

    public void run() {
        for (int i = 0; i < 100; i++){
            lista.adicionar(Thread.currentThread().getName() +"/"+ i);
        }
    }
}
