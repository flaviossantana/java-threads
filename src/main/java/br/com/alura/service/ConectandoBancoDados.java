package br.com.alura.service;

import br.com.alura.banco.GerenciadorDeTransacao;
import br.com.alura.banco.PoolDeConexao;

public class ConectandoBancoDados implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public ConectandoBancoDados(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    public void run() {

        synchronized (pool){
            System.out.println("BD - Criando Pool de Conexão.");
            pool.getConnection();

            synchronized (tx){
                System.out.println("BD - Iniciando Transação.");
                tx.begin();
            }
        }
    }
}
