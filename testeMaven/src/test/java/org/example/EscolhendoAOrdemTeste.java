package org.example;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class) // escolhe ordem dos nome
//@TestMethodOrder(MethodOrderer.Random.class) // randomico
@TestMethodOrder(MethodOrderer.DisplayName.class) // ordem do Display name
public class EscolhendoAOrdemTeste {
    //@Order(3)

    @DisplayName("B")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }
    //@Order(1)
    @DisplayName("A - Teste que testa tal coisa")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }
    //@Order(2)
    @DisplayName("01")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }
    @DisplayName("02")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
