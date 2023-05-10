package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {
        Pessoa pessoa = new Pessoa(
                "Jéssica",
                LocalDateTime.of(2000,1,1,15,0,0)
        );

    @Test
    void deveCalcularIdadeCorretamente(){
        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }

}
