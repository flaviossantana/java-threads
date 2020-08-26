package br.com.alura.main;

import br.com.alura.service.BanheiroService;
import br.com.alura.thread.LimpezaTask;
import br.com.alura.thread.LiquidoTask;
import br.com.alura.thread.SolidoTask;
import com.github.javafaker.Faker;

public class FestaMain {

    public static void main(String[] args) {

        Faker faker = new Faker();
        BanheiroService banheiroService = new BanheiroService();

        for (int i = 0; i <= 2; i++) {
            String nome = faker.name().fullName();
            Runnable task = faker.bool().bool() ?
                    new LiquidoTask(banheiroService) :
                    new SolidoTask(banheiroService);
            new Thread(task, nome).start();
        }

        Thread limpesa = new Thread(
                new LimpezaTask(banheiroService),
                ">>> LIMPEZA - " +
                        faker.zelda().character().toUpperCase());
        limpesa.setDaemon(true);
        limpesa.start();

    }

}
