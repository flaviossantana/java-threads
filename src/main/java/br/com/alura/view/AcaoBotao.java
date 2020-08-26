package br.com.alura.view;

import br.com.alura.thread.MultiplicacaoTask;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }


    public void actionPerformed(ActionEvent e) {
        Runnable cauculoThread = new MultiplicacaoTask(primeiro, segundo, resultado);
        Thread thread = new Thread(cauculoThread, MultiplicacaoTask.class.getSimpleName());
        thread.start();
        resultado.setText("Aguarde!");
        System.out.println("thread.start()");
    }

}
