package exercicios.list.ordencao.pessoas;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome1",20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome2",30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome3",25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome4",17, 1.56);

        // System.out.println(ordenacaoPessoa.ordendarPorAltura());
        System.out.println(ordenacaoPessoa.ordernarPorIdade());
    }
}
