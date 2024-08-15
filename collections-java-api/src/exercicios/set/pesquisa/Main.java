package exercicios.set.pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 0);
        agenda.adicionarContato("Camila Cavalcante", 11111111);
        agenda.adicionarContato("Camila Dio", 65412214);
        agenda.adicionarContato("Vanessinha", 995220707);

        agenda.exibirContatos();

        System.out.println("Atualizando contato: " + agenda.atualizarNumeroContao("Camila Dio", 996541214));

        agenda.exibirContatos();

        System.out.println("Pesquisando contato: " + agenda.pesquisarPorNome("Camila"));
        System.out.println("Pesquisando contato: " + agenda.pesquisarPorNome("Vanessinha"));
    }
}
