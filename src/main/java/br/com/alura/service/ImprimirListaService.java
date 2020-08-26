package br.com.alura.service;

import java.util.List;

public class ImprimirListaService implements Runnable {

    private List<String> lista;

    public ImprimirListaService(List<String> lista) {
        this.lista = lista;
    }

    public void run() {
        try {
            synchronized (lista) {
                lista.wait();

                System.out.println("############### INICIANDO IMPRESSÃO ###############");

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println("#IMPRIMINDO: " + i + " - " + lista.get(i));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
