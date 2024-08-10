import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência com o digito verificador!");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Digite o número do saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Conta criada com Sucesso!");

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero + " e seu saldo R$" + saldo + ", já está disponível para saque");

        scanner.close();
    }
}
