package br.com.alura.service;

import br.com.alura.banco.GerenciadorDeTransacao;
import br.com.alura.banco.PoolDeConexao;

public class ConectandoProcedure implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public ConectandoProcedure(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    public void run() {

        synchronized (tx){
            System.out.println("PKG - Criando Pool de Conexão.");
            tx.begin();

            synchronized (pool){
                System.out.println("PKG - Iniciando Transação.");
                pool.getConnection();
            }
        }
    }
}
