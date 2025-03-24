public class Iphone {
    @SuppressWarnings("FieldMayBeFinal")
    private MeuReprodutorMusical reprodutor;
    @SuppressWarnings("FieldMayBeFinal")
    private MeuTelefone telefone;
    @SuppressWarnings("FieldMayBeFinal")
    private MeuNavegadorInternet navegador;

    public Iphone() {
        this.reprodutor = new MeuReprodutorMusical();
        this.telefone = new MeuTelefone();
        this.navegador = new MeuNavegadorInternet();
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

    public void setRedeMovelDisponivel(boolean status) {
        ((MeuTelefone) telefone).setRedeMovelDisponivel(status);
    }

    public void setConexaoInternet(boolean status) {
        ((MeuNavegadorInternet) navegador).setConexaoInternet(status);
    }
}
