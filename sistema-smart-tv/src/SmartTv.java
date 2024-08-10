/**
 * A classe SmartTv representa uma televisão simples com funcionalidades básicas
 * como ligar, desligar, ajustar o volume e mudar de canal.
 * <p>
 * Esta classe contém métodos para controlar uma televisão, incluindo a capacidade
 * de ligar e desligar, aumentar e diminuir o volume, e navegar pelos canais.
 * </p>
 * 
 * @author SeuNome
 * @version 1.0
 */
public class SmartTv {

    /**
     * Estado atual da TV. Se está ligada ou desligada.
     */
    boolean ligada = false;

    /**
     * Canal atual da TV.
     */
    int canal = 1;

    /**
     * Volume atual da TV.
     */
    int volume = 25;

    /**
     * Liga a TV, alterando o estado de desligada para ligada.
     */
    public void ligar() {
        ligada = true;
    }

    /**
     * Desliga a TV, alterando o estado de ligada para desligada.
     */
    public void desligar() {
        ligada = false;
    }

    /**
     * Aumenta o volume da TV em 1 unidade.
     */
    public void aumentarVolume() {
        volume++;
    }

    /**
     * Diminui o volume da TV em 1 unidade.
     */
    public void diminuirVolume() {
        volume--;
    }

    /**
     * Sobe um canal na TV, incrementando o número do canal em 1.
     */
    public void subirCanal() {
        canal++;
    }

    /**
     * Desce um canal na TV, decrementando o número do canal em 1.
     */
    public void descerCanal() {
        canal--;
    }

    /**
     * Troca para um canal específico na TV.
     * 
     * @param novoCanal O novo canal para o qual a TV deve ser sintonizada.
     */
    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
