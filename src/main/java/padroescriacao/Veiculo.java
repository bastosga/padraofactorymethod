package padroescriacao;

public class Veiculo implements IServico {

    public String executar() {
        return "Veículo cadastrado";
    }

    public String cancelar() {
        return "Veículo não cadastrado";
    }
}
