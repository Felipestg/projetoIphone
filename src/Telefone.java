public interface Telefone {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();

    
    void setRedeMovelDisponivel(boolean status);
    boolean isRedeMovelDisponivel();
}
