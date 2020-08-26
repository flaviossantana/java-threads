package br.com.alura.service;

public class Banheiro {

    public Banheiro() {
        super();
    }

    public void pipi() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa liquida");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " saindo do banheiro");
        }


    }

    public void popo() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa sólida");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " saindo do banheiro");
        }


    }

}
