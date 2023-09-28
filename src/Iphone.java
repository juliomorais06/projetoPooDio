
public class Iphone {
    static aparelhoTelefonico aparelhoTelefonico = new aparelhoTelefonico();
    static navegadorDeInternet navegadorDeInternet = new navegadorDeInternet();
    static reprodutorMusical reprodutorMusical = new reprodutorMusical();

    public static void main(String[] args) {
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.recusarChamada();

        System.out.println("______________________________");

        System.out.println(navegadorDeInternet.exibirPagina());
        System.out.println(navegadorDeInternet.novaAba());
        System.out.println(navegadorDeInternet.atualizarPagina());
        System.out.println(navegadorDeInternet.voltarPagina());
        System.out.println(navegadorDeInternet.avancarPagina());

        System.out.println("______________________________");

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.tocarMusica();
    }
}

