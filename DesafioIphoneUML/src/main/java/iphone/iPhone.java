package iphone;

public abstract class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocarMusica(){
        System.out.println("Reproduzindo música.");
    }
    @Override
    public void pausarMusica(){
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música" + musica + "selecionada");
    }
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Chamada finalizada.");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url);
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando " + url + " aos favoritos.");
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Exibindo histórico de navegação.");
    }
}
