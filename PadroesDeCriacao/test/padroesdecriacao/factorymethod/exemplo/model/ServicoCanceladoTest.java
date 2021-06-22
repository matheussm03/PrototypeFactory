package padroesdecriacao.factorymethod.exemplo.model;

import static junit.framework.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import padroesdecriacao.factorymethod.exemplo.factory.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCanceladoTest {

    @Test
    void deveExecutarCancelado() {
        IServico servico = ServicoFactory.obterServico("Cancelado");
        assertEquals("Cancelamento Confirmado", servico.executar());
    }

    @Test
    void deveCancelarCancelado() {
        IServico servico = ServicoFactory.obterServico("Cancelado");
        assertEquals("Desfeito Cancelamento", servico.cancelar());
    }

}