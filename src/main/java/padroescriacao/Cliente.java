package padroescriacao;

public class Cliente implements IServico {

    public String executar() {
        return "Cliente Cadastrado";
    }

    public String cancelar() {
        return "Cliente não cadastrado";
    }
}