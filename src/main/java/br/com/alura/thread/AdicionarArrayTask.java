package br.com.alura.thread;

import br.com.alura.core.ArrayUtil;

public class AdicionarArrayTask implements Runnable {

    private ArrayUtil lista;

    public AdicionarArrayTask(ArrayUtil lista) {
        this.lista = lista;
    }

    public void run() {
        for (int i = 0; i < 100; i++){
            lista.adicionar(Thread.currentThread().getName() +"/"+ i);
        }
    }
}
