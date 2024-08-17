package functionalInterface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
/**
 * Desafio 8 - Somar os dígitos de todos os números da lista:
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 * List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
 */
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int somaTotal = numeros.stream()
    .flatMapToInt(n -> String.valueOf(n).chars())
    .map(ch -> ch - '0')
    .sum();

    System.out.println(somaTotal);
}
}
