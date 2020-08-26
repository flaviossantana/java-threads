package br.com.alura.service;

import br.com.alura.core.MsgUtil;

import static br.com.alura.constant.Msg.*;

public class BanheiroService {

    private int usado = 0;
    private Boolean isSujo = false;

    public BanheiroService() {
        super();
    }

    public void limpar() {

        String nome = Thread.currentThread().getName();
        MsgUtil.print(nome + TEM_GENTE);

        synchronized (this){
            MsgUtil.print(nome + ENTRANDO_NO_BANEHIRO);

            if(!isSujo){
                MsgUtil.print(nome + " banheiro ainda está limpo.");
                return;
            }

            MsgUtil.print(nome + " fazendo limpeza");
            this.isSujo = false;

            sleep(800);

            this.usado = 0;
            MsgUtil.print(nome + SAINDO_DO_BANHEIRO);
            this.notifyAll();
        }
    }

    public void pipi() {
        realizaInstucoes(FAZENDO_COISA_LIQUISA, 200);
    }

    public void popo() {
        realizaInstucoes(FAZENDO_COISA_SOLIDA, 400);
    }

    private void realizaInstucoes(String msgExecucao, int tempoExecucao) {
        String nome = Thread.currentThread().getName();
        MsgUtil.print(nome + TEM_GENTE);

        synchronized (this) {
            MsgUtil.print(nome + ENTRANDO_NO_BANEHIRO);

            enquantoEsperaLimpeza(nome);

            MsgUtil.print(nome + msgExecucao);

            sleep(tempoExecucao);

            MsgUtil.print(nome + DANDO_DESCARGA);
            MsgUtil.print(nome + LAVANDO_A_MAO);
            MsgUtil.print(nome + SAINDO_DO_BANHEIRO);

            verificarLimpeza(nome);
        }
    }

    private synchronized void enquantoEsperaLimpeza(String nome) {
        while (isSujo) {
            esperarLimpeza(nome);
        }
    }

    private synchronized void verificarLimpeza(String nome) {
        if (isPrecisafazerLimpeza(nome)) {
            esperar();
        }
    }

    private synchronized boolean isPrecisafazerLimpeza(String nome) {
        this.usado++;
        MsgUtil.print(nome + " foi o " + this.usado +"º a usar.");

        if(this.usado > 1){
            this.isSujo = true;
        }

        return this.isSujo;
    }

    private synchronized void esperarLimpeza(String nome) {
        MsgUtil.print(nome + " eca, o banheiro está sujo!");
        esperar();
    }

    private synchronized void esperar() {
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
