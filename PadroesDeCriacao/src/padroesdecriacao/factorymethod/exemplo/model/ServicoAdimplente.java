package padroesdecriacao.factorymethod.exemplo.model;

public class ServicoAdimplente implements IServico {

    public String executar() {
        return "Adimplencia Confirmada";
    }

    public String cancelar() {
        return "Adimplencia Cancelada";
    }
}
