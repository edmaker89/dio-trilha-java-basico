package exercicios.map.operacoesBasicas.contatos;

public class Main {
    public static void main(String[] args) {
        
        AgendaContatos agenda = new AgendaContatos();
    
        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 62985422);
        agenda.adicionarContato("Camila Cavalcante", 11111111);
        agenda.adicionarContato("Camila Dio", 65412214);
        agenda.adicionarContato("Vanessinha", 995220707);

        agenda.exibirContato();

        System.out.println(
            agenda.pesquisarPorNome("Vanessinha")
        );

        agenda.removerContato("Camila Dio");

        agenda.exibirContato();
    }

}
