package br.com.alura.core;

public class ListaUtil {

    private String[] elementos = new String[10000];
    private Integer indice = 0;

    public synchronized void adicionar(String elemento){
        this.elementos[indice] = elemento;
        this.indice++;
    }

    public int tamanho(){
        return this.elementos.length;
    }

    public String pegar(Integer indice){
        return this.elementos[indice];
    }

}
