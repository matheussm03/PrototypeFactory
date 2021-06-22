package padroesdecriacao.factorymethod.exemplo.model;

public class ServicoSuspenso implements IServico {

    public String executar() {
        return "Suspensao Confirmada";
    }

    public String cancelar() {
        return "Suspensao Cancelada";
    }
}
