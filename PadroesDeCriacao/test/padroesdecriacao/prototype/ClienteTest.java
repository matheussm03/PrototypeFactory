package padroesdecriacao.prototype;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente(001, "Cliente Original", "11111111111", new Plano("Plano A", 100), "32988887777");

        Cliente clienteClone = cliente.clone();
        clienteClone.setCodigo(002);
        clienteClone.setNome("Cliente Clonado");
        clienteClone.getPlano().setPreco(200);

        assertEquals("Cliente{codigo=001, nome='Cliente Original', cpf='11111111111', plano=Plano{nome='Plano A', preco=100}, celular='32988887777'}", cliente.toString());
        assertEquals("Cliente{codigo=002, nome='Cliente Clonado', cpf='11111111111', plano=Plano{nome='Plano A', preco=200}, celular='32988887777'}", clienteClone.toString());
    }
}