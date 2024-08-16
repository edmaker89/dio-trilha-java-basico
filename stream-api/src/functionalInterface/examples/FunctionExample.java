package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * utlizada para transformar ou mapear os elementos do Stream em outros
 * valores ou tipos.
 * Function<T, R> - tipo entrada, tipo saida
 */
public class FunctionExample {
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

    //usar a functon com expr lambda para dobrar todos os numeros
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    //usar a func para dobrar todos os numeros no Stream e armazena-los em outra lista
    // map quando quero mapear de um valor para outro
    List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();
    List<Integer> numerosTriplicados = numeros.stream().map(n -> n * 3).toList();

    //imprimir os numeros dobrados
    numerosDobrados.forEach(System.out::println);
    numerosTriplicados.forEach(System.out::println);
}
}
