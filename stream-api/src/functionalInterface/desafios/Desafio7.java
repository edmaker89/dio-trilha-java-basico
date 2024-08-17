package functionalInterface.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
/**
 * Desafio 7 - Encontrar o segundo número maior da lista:
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // int maiorNumero = numeros.stream().max(Comparator.naturalOrder()).get();
    // int segundMaiorNumero = numeros.stream().filter(n -> n < maiorNumero).max(Comparator.naturalOrder()).get();

    // System.out.println(segundMaiorNumero);

    Optional<Integer> segundoMaior = numeros.stream()
        .distinct() //tira os repetidos
        .sorted(Comparator.reverseOrder()) //reverte a ordem
        .skip(1) // pula o primeiro
        .findFirst(); // pega o primeiro

    segundoMaior.ifPresent(System.out::println); //se existir imprime
}
}
