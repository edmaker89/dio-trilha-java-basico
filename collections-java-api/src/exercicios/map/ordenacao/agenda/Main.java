package exercicios.map.ordenacao.agenda;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 15), "Festa de agosto", "Biriba Shows");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 9), "Festa de Setembro", "Resist Duo Show");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 24), "Festa Junina", "Palestra sobre cores: Vanessa G.");
    
        agendaEventos.exibirAgenda();
    
        agendaEventos.obterProximoEvento();
    }
}
