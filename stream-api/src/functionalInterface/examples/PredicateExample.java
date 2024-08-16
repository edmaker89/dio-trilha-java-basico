package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Filtrar os elementos do Stream com base em alguma condição
 */
public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "kotlin", "python", "javascript", "c", "go", "ruby");

    //predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> masiDeCincoCaracteres = palavra -> palavra.length() < 5;

    //Usar o Stream para filtrar as palavras com mais de 5 caracteres e em seguida
    //imprimir cada palavra que passou o filtro
    palavras.stream().filter(masiDeCincoCaracteres).forEach(System.out::println);
    palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }

}
