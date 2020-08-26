package br.com.alura.main;

import br.com.alura.core.ListaUtil;
import br.com.alura.thread.AdicionarlistaTask;

public class AdicionarListaMain {
    public static void main(String[] args) throws InterruptedException {
        ListaUtil lista = new ListaUtil();

        for (int i = 0; i < 100; i++){
            new Thread(new AdicionarlistaTask(lista), "THREAD 0" + i)
                    .start();
        }

        Thread.sleep(12000);
        System.out.println("####### PROCESSANDO RESULTADO #######");

        for (int i = 0; i < lista.tamanho(); i++){
            System.out.println(i + " - " + lista.pegar(i));
        }

    }
}
