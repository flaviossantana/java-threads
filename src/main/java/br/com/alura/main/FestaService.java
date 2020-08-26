package br.com.alura.main;

import br.com.alura.service.BanheiroService;
import br.com.alura.thread.SolidoTask;
import br.com.alura.thread.LiquidoTask;
import com.github.javafaker.Faker;

public class FestaService {

    public static void main(String[] args) {

        Faker faker = new Faker();
        BanheiroService banheiroService = new BanheiroService();

        for (int i = 0; i <= 1000; i++) {
            String nome = faker.name().fullName();
            Runnable task = faker.bool().bool() ?
                    new LiquidoTask(banheiroService) :
                    new SolidoTask(banheiroService);

            new Thread(task, nome).start();
        }


    }

}
