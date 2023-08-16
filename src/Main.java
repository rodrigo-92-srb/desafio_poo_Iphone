import Componentes.Iphone;


public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Scar Tissue - Red Hot Chilli Pepers");
        iphone.tocar("Scar Tissue - Red Hot Chilli Pepers");
        iphone.pausar();
        iphone.ligar("(31) 98989-0000");
        iphone.iniciarCorreioVoz("Me liga quando receber essa mensagem", "(31) 98989-0000");
        iphone.atender("(31) 98989-0000");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }
}