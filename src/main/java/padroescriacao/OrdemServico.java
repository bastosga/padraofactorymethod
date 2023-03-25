package padroescriacao;

public class OrdemServico implements IServico {

    public String executar() {
        return "Ordem de serviço autorizada";
    }

    public String cancelar() {
        return "Ordem de serviço cancelada";
    }
}
