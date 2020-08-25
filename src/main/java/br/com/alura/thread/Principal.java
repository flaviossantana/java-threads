package br.com.alura.thread;

import java.util.concurrent.TimeUnit;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando Thread!");

        // milissegundos (5 * 1000 = 5s)
        Thread.sleep(TimeUnit.SECONDS.toMillis(120));

        System.out.println("Finalizando Thread!");
    }

}
