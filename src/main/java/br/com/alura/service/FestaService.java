package br.com.alura.service;

import br.com.alura.thread.SolidoTask;
import br.com.alura.thread.LiquidoTask;
import com.github.javafaker.Faker;

public class FestaService {

    public static void main(String[] args) {

        Faker faker = new Faker();
        Banheiro banheiro = new Banheiro();

        for (int i = 0; i <= 1000; i++) {
            String nome = faker.name().fullName();
            Runnable task = faker.bool().bool() ?
                    new LiquidoTask(banheiro) :
                    new SolidoTask(banheiro);

            new Thread(task, nome).start();
        }


    }

}
