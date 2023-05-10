package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa humano = new Pessoa("Renan",LocalDate.of(1992,03,05));

        System.out.println(humano.getIdade());

    }
}