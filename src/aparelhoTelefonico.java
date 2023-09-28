
public class aparelhoTelefonico extends Iphone{
    public void ligar() {
        System.out.println("Chamada iniciada!");
    }
    public void desligar() {
        System.out.println("Chamada finalizada!");
    }
    public void atender() {
        System.out.println("Chamada atendida!");
    }
    public void recusarChamada() {
        System.out.println(iniciarCorreioDeVoz());
    }
    public String iniciarCorreioDeVoz() {
        return "Deixe sua mensagem na caixa postal";
    }
}