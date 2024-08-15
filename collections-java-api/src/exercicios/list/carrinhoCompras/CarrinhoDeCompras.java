package exercicios.list.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void adicionarItem(String nome, double preco) {
        listaItens.add(new Item(nome, preco));
    }

    public void removerItem(String nome) {
        List<Item> listaRemover = new ArrayList<>();
        for (Item item : listaItens) {
            if (item.nome.equalsIgnoreCase(nome)) {
                listaRemover.add(item);
            }
        }
        listaItens.removeAll(listaRemover);
    }

    /**
     * Imprime o valor total no terminal
     */
    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : listaItens) {
            valorTotal = valorTotal + (item.preco * item.quantidade);
        }
        System.out.println(valorTotal);
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public int oberQuantidadeDeItens() {
        return listaItens.size();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println(carrinho.oberQuantidadeDeItens());

        carrinho.adicionarItem("Arroz 5kg", 32.90);
        carrinho.adicionarItem("Sabonete", 5, 2.75);
        carrinho.adicionarItem("Detergente", 3, 1.25);
        System.out.println(carrinho.oberQuantidadeDeItens());

        carrinho.removerItem("Sabonete");
        System.out.println(carrinho.oberQuantidadeDeItens());

        System.out.println("Valor total do carrinho: ");
        carrinho.calcularValorTotal();

        System.out.println("Imprimindo itens do carrinho: ");
        carrinho.exibirItens();
    }
}
