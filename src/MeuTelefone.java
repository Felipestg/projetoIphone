public class MeuTelefone implements Telefone {
    private boolean redeMovelDisponivel;

    public MeuTelefone() {
        this.redeMovelDisponivel = true;     }

    @Override
    public void setRedeMovelDisponivel(boolean status) {
        this.redeMovelDisponivel = status;
        String mensagem = status ? "Rede móvel disponível." : "Sem rede móvel.";
        System.out.println(mensagem);
    }

    @Override
    public boolean isRedeMovelDisponivel() {
        return redeMovelDisponivel;
    }

    @Override
    public void ligar(String numero) {
        if (redeMovelDisponivel) {
            System.out.println("Ligando para: " + numero);
        } else {
            System.out.println("Não é possível ligar. Sem rede móvel.");
        }
    }

    @Override
    public void atender() {
        if (redeMovelDisponivel) {
            System.out.println("Atendendo chamada...");
        } else {
            System.out.println("Sem rede móvel. Chamada não recebida.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (redeMovelDisponivel) {
            System.out.println("Iniciando correio de voz...");
        } else {
            System.out.println("Não é possível acessar o correio de voz. Sem rede móvel.");
        }
    }
}
