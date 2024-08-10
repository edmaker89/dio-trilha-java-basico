import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public void inicializar() {
        System.out.println("Hello, estou sendo executado pelo terminal");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Confirme sua altura");
        double altura = scanner.nextDouble();

        System.out.println(altura);

        scanner.close();
    }
}
