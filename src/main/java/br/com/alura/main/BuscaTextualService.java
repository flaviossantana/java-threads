package br.com.alura.main;

import br.com.alura.core.IO;
import br.com.alura.thread.BuscaTextualTask;

import java.io.File;

public class BuscaTextualService {

    public static void main(String[] args) throws InterruptedException {
        for (File file : new File(IO.path("txt/")).listFiles()) {
            new Thread(
                    new BuscaTextualTask(" ", file.getPath()),
                    file.getName()
            ).start();
        }
    }
}
