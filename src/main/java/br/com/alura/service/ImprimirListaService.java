package br.com.alura.service;

import java.util.List;

public class ImprimirListaService implements Runnable {

    private List<String> lista;
    private int totalItens;

    public ImprimirListaService(int totalItens, List<String> lista) {
        this.totalItens = totalItens;
        this.lista = lista;
    }

    public void run() {
        try {

            synchronized (lista) {

                if(lista.size() != totalItens){
                    System.out.println("#Lista não está cheia");
                    lista.wait();
                }

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
