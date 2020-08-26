package br.com.alura.main;

import br.com.alura.thread.AdicionarListaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AdicionarListaMain {
    public static void main(String[] args) throws InterruptedException {

        List<String> lista = new Vector<String>();

        for (int i = 0; i < 10; i++){
            new Thread(new AdicionarListaTask(lista), "THREAD 0" + i)
                    .start();
        }

        Thread.sleep(12000);
        System.out.println("####### PROCESSANDO RESULTADO #######");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(i + " - " + lista.get(i));
        }

    }
}
