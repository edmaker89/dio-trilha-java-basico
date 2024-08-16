package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * usada para realizar operações em pares de elementos
 * como somar numeros ou combinar objetos
 * BinaryOperator<T, T>
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream().reduce(0, somar);

        System.out.println(resultado);

        int resultado2 = numeros.stream().reduce(1, (num1, num2) -> num1 + num2);
        int resultado3 = numeros.stream().reduce(4, Integer::sum);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
