package br.com.alura.main;

import br.com.alura.core.ArrayUtil;
import br.com.alura.thread.AdicionarArrayTask;

public class AdicionarArrayMain {
    public static void main(String[] args) throws InterruptedException {
        ArrayUtil lista = new ArrayUtil();

        for (int i = 0; i < 100; i++){
            new Thread(new AdicionarArrayTask(lista), "THREAD 0" + i)
                    .start();
        }

        Thread.sleep(12000);
        System.out.println("####### PROCESSANDO RESULTADO #######");

        for (int i = 0; i < lista.tamanho(); i++){
            System.out.println(i + " - " + lista.pegar(i));
        }

    }
}
