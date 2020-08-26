package br.com.alura.service;

import br.com.alura.thread.SolidoTask;
import br.com.alura.thread.LiquidoTask;
import com.github.javafaker.Faker;

public class FestaService {

    public static void main(String[] args) {

        Faker faker = new Faker();
        Banheiro banheiro = new Banheiro();

        for (int i = 0; i <= 4; i++) {
            String name = faker.name().fullName();

            Runnable task = faker.bool().bool() ?
                    new LiquidoTask(name, banheiro) :
                    new SolidoTask(name, banheiro);

            new Thread(task).start();
        }


    }

}
