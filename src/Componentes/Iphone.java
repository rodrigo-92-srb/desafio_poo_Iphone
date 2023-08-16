package Componentes;

public class Iphone implements telefone, reprodutorMusical, navegadorInternet{

    public void exibirPagina(){
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo chamada de: "+numero);
    }

    @Override
    public String iniciarCorreioVoz(String mensagem, String numero) {
        System.out.println("Inciando correio de voz para: "+numero);
        return mensagem;
    }

    public void tocar(String musica){
        System.out.println("Tocando: "+musica);
    }

    public void pausar(){
        System.out.println("Pausando música...");
        System.out.println("Reprodução pausada");
    }

    public String selecionarMusica(String musica){
        System.out.println("Selecionando música "+musica);
        return musica;
    }
}
