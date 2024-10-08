package exercicios.map.operacoesBasicas.contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContato;

    public AgendaContatos() {
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContato.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContato.isEmpty()) {
            agendaContato.remove(nome);
        }
    }
    
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContato.isEmpty()) {
            numeroPorNome = agendaContato.get(nome);
        }
        return numeroPorNome;
    }

    public void exibirContato() {
        System.out.println(agendaContato);
    }
}
