package padroesdecriacao.factorymethod.exemplo.model;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import padroesdecriacao.factorymethod.exemplo.factory.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoSuspensoTest {

    @Test
    void deveExecutarSuspenso() {
        IServico servico = ServicoFactory.obterServico("Suspenso");
        assertEquals("Suspensao Confirmada", servico.executar());
    }

    @Test
    void deveCancelarSuspenso() {
        IServico servico = ServicoFactory.obterServico("Suspenso");
        assertEquals("Suspensao Cancelada", servico.cancelar());
    }

}