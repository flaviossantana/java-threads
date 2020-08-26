package br.com.alura.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuscaTextualTask implements Runnable {

    private String word;
    private String fileName;

    public BuscaTextualTask(String word, String fileName) {
        this.word = word.toLowerCase();
        this.fileName = fileName;
    }

    public void run() {

        try {

            Integer count = 1;
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()){
                String linha = scanner.nextLine().toLowerCase();
                if(linha.contains(word)){
                    System.out.println(
                            Thread.currentThread().getName().toUpperCase() +
                                    "-" +
                                    "> LINHA: "+
                                    count +
                                    "|"+
                                    linha
                    );
                }
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
