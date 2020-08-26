package br.com.alura.main;

import br.com.alura.service.ImprimirListaService;
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

        new Thread(new ImprimirListaService(lista)).start();
    }
}
