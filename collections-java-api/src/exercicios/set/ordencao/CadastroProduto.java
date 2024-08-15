package exercicios.set.ordencao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    public Set<Produto> produtosSet;

    public CadastroProduto() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long Cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(nome, Cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }
    
}
