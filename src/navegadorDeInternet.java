

public class navegadorDeInternet extends Iphone {
    private String exibir = "Exibindo página";
    private String abrir = "Abrindo nova aba";
    private String atualizar = "Atualizando página";
    private String voltar = "Voltando à página anterior";
    private String avancar = "Passando para próxima página";
    
    public String exibirPagina() {
        return exibir;
    }
    public String novaAba() {
        return abrir;
    }
    public String atualizarPagina() {
        return atualizar;
    }
    public String voltarPagina() {
        return voltar;
    }
    public String avancarPagina() {
        return avancar;
    }
}
