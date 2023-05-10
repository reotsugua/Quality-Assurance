package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    //@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_16)
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    @EnabledOnJre(JRE.JAVA_17)
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "Renan")
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assertions.assertEquals(10, 5+5);
    }
}
