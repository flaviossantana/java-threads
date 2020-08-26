package br.com.alura.service;

public class BanheiroService {

    private Boolean isSujo = false;
    private int usado = 0;

    public BanheiroService() {
        super();
    }

    public void pipi() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");

            while(isSujo){
                esperarLimpeza(nome);
            }

            System.out.println(nome + " fazendo coisa liquida");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " saindo do banheiro");

            verificarLimpeza(nome);

        }


    }

    public void popo() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pergunta... Tem gente?");

        synchronized (this){
            System.out.println(nome + " entrando no banheiro");

            while(isSujo){
                esperarLimpeza(nome);
            }

            System.out.println(nome + " fazendo coisa sólida");

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " saindo do banheiro");

            verificarLimpeza(nome);

        }


    }

    private synchronized void verificarLimpeza(String nome) {
        if (isPrecisafazerLimpeza(nome)) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
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
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.usado = 0;
            System.out.println(nome + " saindo do banheiro");
            this.notifyAll();
        }


    }

    private synchronized boolean isPrecisafazerLimpeza(String nome) {
        this.usado++;
        System.out.println(nome + " foi o " + this.usado +"º a usar.");
        if(this.usado > 1){
            this.isSujo = true;
        }

        return this.isSujo;
    }


    private synchronized void esperarLimpeza(String nome) {
        System.out.println(nome + " eca, o banheiro está sujo!");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
