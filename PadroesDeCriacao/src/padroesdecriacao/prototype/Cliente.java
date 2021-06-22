package main.java.padroesdecriacao.prototype;

public class Cliente implements Cloneable {
    private int codigo;
    private String nome;
    private String cpf;
    private Plano plano;
    private String celular;

    public Cliente(int codigo, String nome, String cpf, Plano plano, String celular) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.plano = plano;
        this.celular = celular;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.nome = cpf;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.plano = (Plano) clienteClone.plano.clone();
        return clienteClone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", plano=" + plano +
                ", celular='" + celular + '\'' +
                '}';
    }
}
