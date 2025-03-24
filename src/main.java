public class main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

       
        meuIphone.getReprodutor().selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.getReprodutor().tocar();
        meuIphone.getReprodutor().pausar();

        meuIphone.getTelefone().ligar("11987654321");
        meuIphone.getNavegador().exibirPagina("https://www.google.com");

       
        meuIphone.setRedeMovelDisponivel(false);
        meuIphone.getTelefone().ligar("11987654321");
        meuIphone.getTelefone().atender();
        meuIphone.getTelefone().iniciarCorreioVoz();

        
        meuIphone.setConexaoInternet(false);
        meuIphone.getNavegador().exibirPagina("https://www.google.com");
        meuIphone.getNavegador().atualizarPagina();
    }
}
