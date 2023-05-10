package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //faz algo
        LOGGER.info("Iniciou conexao");
    }
    public static void finalizarConexao(){
        //faz algo
        LOGGER.info("Finalizou conexao");
    }
    public static void inserirDados(Pessoa pessoa){
        //Insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }
    public static void removerDados(Pessoa pessoa){
        //Remove pessoa no DB
        LOGGER.info("Removeu dados");

    }
}
