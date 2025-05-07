public class Iphone2025 implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void abrirPagina() {
        System.out.println("Abrindo página: ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: ");
    }

    @Override
    public void navegar() {

        System.out.println("Navegando na internet:");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para a página anterior.");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música ");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música ");
    }

    @Override
    public void playMusica() {
        System.out.println("Tocando música ");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando música ");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada  ");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada para ");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada com: ");

    }

    public static void main(String[] args) {
        Iphone2025 iphone1 = new Iphone2025();
        iphone1.abrirPagina();
        iphone1.atualizarPagina();
        iphone1.navegar();
        iphone1.playMusica();
        iphone1.reproduzirMusica();
        iphone1.pausarMusica();
        iphone1.fazerChamada();

    }
}