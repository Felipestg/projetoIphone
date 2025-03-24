public class MeuNavegadorInternet implements NavegadorInternet {
    private boolean conexaoInternet;

    public MeuNavegadorInternet() {
        this.conexaoInternet = true; 
    }

    @Override
    public void setConexaoInternet(boolean status) {
        this.conexaoInternet = status;
        String mensagem = status ? "Conectado à internet." : "Sem conexão com a internet.";
        System.out.println(mensagem);
    }

    @Override
    public boolean isConexaoInternet() {
        return conexaoInternet;
    }

    @Override
    public void exibirPagina(String url) {
        if (conexaoInternet) {
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("Erro: Sem conexão com a internet.");
        }
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        if (conexaoInternet) {
            System.out.println("Página atualizada.");
        } else {
            System.out.println("Erro: Sem conexão para atualizar a página.");
        }
    }
}
