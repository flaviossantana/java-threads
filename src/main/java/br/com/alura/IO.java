package br.com.alura;

public class IO {

    public static String path(String fileName){
        return IO.class.getClassLoader().getResource(fileName).getPath();
    }

}
