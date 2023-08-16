package Componentes;

public interface telefone {

    public void ligar(String numero);

    public void atender(String numero);

    public String iniciarCorreioVoz(String mensagem, String numero);
}
