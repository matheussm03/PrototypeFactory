package padroesdecriacao.factorymethod.exemplo.model;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import padroesdecriacao.factorymethod.exemplo.factory.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAdimplenteTest {

    @Test
    void deveExecutarAdimplente() {
        IServico servico = ServicoFactory.obterServico("Adimplente");
        assertEquals("Adimplencia Confirmada", servico.executar());
    }

    @Test
    void deveCancelarAdimplente() {
        IServico servico = ServicoFactory.obterServico("Adimplente");
        assertEquals("Adimplencia Cancelada", servico.cancelar());
    }

}