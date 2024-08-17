public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas Silva");
        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        
        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(20, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
