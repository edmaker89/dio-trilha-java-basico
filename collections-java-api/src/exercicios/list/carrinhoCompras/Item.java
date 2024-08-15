package exercicios.list.carrinhoCompras;

public class Item {
    public String nome;
    public double preco;
    public int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * @param nome
     * @param preco
     * @param quantidade A quantidade do item será 1.
     */
    public Item(String nome, double preco) {
        
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 1;
    }

    @Override
    public String toString() {
        return "\nItem: nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade;
    }

    

    
    
}
