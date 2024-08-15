package exercicios.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato contato : contatosSet) {
            if(contato.getNome().startsWith(nome)) {
                //startwith pega o nome como prefixo para a pesquisa
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContao(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
            for (Contato contato : contatosSet) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                    contatoAtualizado = contato;
                    break;
                }
            }
        return contatoAtualizado;
    }
    
}
