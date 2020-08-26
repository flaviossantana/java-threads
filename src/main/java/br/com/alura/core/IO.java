package br.com.alura.core;

public class IO {

    public static String path(String fileName){
        return IO.class.getClassLoader().getResource(fileName).getPath();
    }

}
