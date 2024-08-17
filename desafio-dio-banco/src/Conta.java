public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    private static int SEQUENCIAL = 1;
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComum() {
        System.out.println((String.format("Titular: %s", this.cliente.getNome())));
        System.out.println((String.format("Agencia: %d", this.getAgencia())));
        System.out.println((String.format("Número: %d", this.getNumero())));
        System.out.println((String.format("Saldo: %.2f", this.getSaldo())));
    }

}
