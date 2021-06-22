package padroesdecriacao.factorymethod.exemplo.model;

public class ServicoCancelado implements IServico {

    public String executar() {
        return "Cancelamento Confirmado";
    }

    public String cancelar() {
        return "Desfeito Cancelamento";
    }
}
