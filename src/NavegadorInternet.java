public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();

    
    void setConexaoInternet(boolean status);
    boolean isConexaoInternet();
}
