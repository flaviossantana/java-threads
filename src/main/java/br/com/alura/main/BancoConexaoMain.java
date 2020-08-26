package br.com.alura.main;

import br.com.alura.banco.GerenciadorDeTransacao;
import br.com.alura.banco.PoolDeConexao;
import br.com.alura.service.ConectandoBancoDados;
import br.com.alura.service.ConectandoProcedure;

public class BancoConexaoMain {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();

        new Thread(
                new ConectandoBancoDados(pool,tx),
                "ConectandoBancoDados"
        ).start();

        new Thread(
                new ConectandoProcedure(pool,tx),
                "ConectandoProcedure"
        ).start();

    }

}
