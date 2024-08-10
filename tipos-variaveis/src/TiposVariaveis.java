public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        short numeroCurto2 = (short) numeroCurto;
        System.out.println(numeroCurto2 + salarioMinimo);
        
        // constante - não muda final
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
