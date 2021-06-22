package main.java.padroesdecriacao.prototype;

public class Plano implements Cloneable {
    private String nome;
    private double preco;

    public Plano(String nome, double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Plano{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
