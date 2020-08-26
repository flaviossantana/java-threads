package br.com.alura.service;

public class BanheiroService {

    private Boolean isSujo = true;
    private int usado = 0;

    public BanheiroService() {
        super();
    }

    public void pipi() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");

            if(isSujo){
                esperarLimpeza(nome);
            }

            System.out.println(nome + " fazendo coisa liquida");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " saindo do banheiro");

            if(isPrecisafazerLimpeza()){
                System.out.println(nome + " Cadê a tia da limpeza");
            }

        }


    }

    public void popo() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");

            if(isSujo){
                esperarLimpeza(nome);
            }

            System.out.println(nome + " fazendo coisa sólida");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " saindo do banheiro");

            if(isPrecisafazerLimpeza()){
                System.out.println(nome + " Cadê a tia da limpeza");
            }

        }


    }

    public void limpar() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");

            if(!isSujo){
                System.out.println(nome + " banheiro ainda está limpo.");
                return;
            }

            System.out.println(nome + " fazendo limpeza");
            this.isSujo = false;

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.usado = 0;
            this.notifyAll();

            System.out.println(nome + " saindo do banheiro");
        }


    }

    private synchronized boolean isPrecisafazerLimpeza() {
        this.usado++;

        System.out.println("O banheiro foi usado " + this.usado +"X");

        if(this.usado > 1){
            this.isSujo = true;
        }

        return this.isSujo;
    }


    private void esperarLimpeza(String nome) {
        System.out.println(nome + " eca, o banheiro está sujo!");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
