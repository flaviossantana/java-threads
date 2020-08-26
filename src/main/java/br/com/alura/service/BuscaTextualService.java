package br.com.alura.service;

import br.com.alura.IO;
import br.com.alura.thread.BuscaTextualThread;

import java.io.File;

public class BuscaTextualService {

    public static void main(String[] args) {
        for (File file : new File(IO.path("txt/")).listFiles()) {
            new Thread(
                    new BuscaTextualThread("a", file.getPath()),
                    file.getName())
                    .start();
        }
    }
}
