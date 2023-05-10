package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AsserionsTeste {

    @Test
    void validarLancamentos(){

        int[] primeiroLcancamento = {10,20,30,40,50};
        //int[] segundoLcancamento = {10,5,2,3,10};
        int[] segundoLcancamento = {10,20,30,40,50};

        assertArrayEquals(primeiroLcancamento,segundoLcancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());;
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }





}
