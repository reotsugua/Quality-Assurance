package org.example.junit;

import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2021, 01, 01));
        Assertions.assertEquals(2, pessoa.getIdade());
    }
}
