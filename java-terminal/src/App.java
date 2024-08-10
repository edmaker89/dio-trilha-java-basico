public class App {
    public static void main(String[] args) throws Exception {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.inicializar();
        
        if (args.length > 0) {
            
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.valueOf(args[2]);
            double altura = Double.valueOf(args[3]);
            
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm");
        }


    }
}
