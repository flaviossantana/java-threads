package br.com.alura.thread;

import javax.swing.*;
import java.math.BigInteger;

public class MultiplicacaoExec implements Runnable {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public MultiplicacaoExec(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    public void run() {

        System.out.println("CalculoThread.run()");

        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());
        BigInteger calculo = new BigInteger("0");

        for (int i = 0; i < valor1; i++) {
            System.out.println("VALOR01: " + i);
            for (int j = 0; j < valor2; j++) {
                System.out.println("VALOR02: " + j);
                calculo = calculo.add(new BigInteger("1"));
                System.out.println("CALCULO: " + calculo);
            }
        }

        resultado.setText(calculo.toString());

    }

}
