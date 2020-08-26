package br.com.alura.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuscaTextualThread implements Runnable {

    private String word;
    private String fileName;

    public BuscaTextualThread(String word, String fileName) {
        this.word = word;
        this.fileName = fileName;
    }

    public void run() {

        try {
            Integer count = 1;
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()){
                String linha = scanner.nextLine();
                if(linha.toLowerCase().contains(word.toLowerCase())){
                    System.out.println(
                            fileName.toUpperCase() + "> LINHA: "+
                                    count
                                    +"|"+ linha
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
