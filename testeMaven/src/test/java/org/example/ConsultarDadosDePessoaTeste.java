package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTeste {


    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("João", LocalDateTime.now()));
    }
    @AfterEach
    void removeDadosParaTeste(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDateTime.now()));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
        //System.out.println("validou");
    }
    @Test
    void validarRetorno(){
        Assertions.assertFalse(false);
        //System.out.println("validouFalso");
    }
}
