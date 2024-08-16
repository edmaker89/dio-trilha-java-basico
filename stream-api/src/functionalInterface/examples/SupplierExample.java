package functionalInterface.examples;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
public static void main(String[] args) {
    // supplier com lambda para uma saudação personalida
    // Supplier<String> saudacao = () -> "Olá, seja bem vindo";

    // usar o supplier para obert uma lista com 5 saudações
    // List<String> listaSaudacao = Stream.generate(saudacao).limit(5).toList();
    List<String> listaSaudacao = Stream.generate(() -> "Olá, seja bem vindo").
        limit(3).toList(); //estilo arrow funciton js

    //imprimir as saudacoes geradas
    // listaSaudacao.forEach(s -> System.out.println(s));
    listaSaudacao.forEach(System.out::println); //reference method
}
}
