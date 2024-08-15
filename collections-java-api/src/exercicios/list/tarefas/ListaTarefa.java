package exercicios.list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero total de elementos: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Estudar 2horas de bootcamp Claro");
        listaTarefa.adicionarTarefa("Olhar a vanessinha por alguns minutos");
        listaTarefa.adicionarTarefa("Olhar a vanessinha por alguns minutos");
        listaTarefa.adicionarTarefa("Sair na festa de agosto");
        System.out.println("Numero total de elementos: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Olhar a vanessinha por alguns minutos");
        System.out.println("Numero total de elementos: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
