package functionalInterface.examples;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
   public static <T> void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    //user o consumer com expr lambda para imprimir numeros pares
    // Consumer<Integer> imprimirNumeroPar = numero -> {
    //     if (numero % 2 == 0) {
    //         System.out.println(numero);
    //     }
    // };

    // consumer para imprimir numeros pares no stream
    // numeros.stream().forEach(imprimirNumeroPar);
    // numeros.stream().forEach(new Consumer<Integer>() {

    //     @Override
    //     public void accept(Integer t) {
    //         if(t % 2 == 0 ) {
    //             System.out.println(t);
    //         }
    //     }
        
    // });
    // forma mais sumplificada
    numeros.forEach(n -> {
        if (n % 2 == 0) {
            System.out.println(n);
        }
    });

    numeros.stream().filter(n -> n % 2 == 1).forEach(System.out::println);

   }
}

