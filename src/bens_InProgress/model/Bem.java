package bens_InProgress.model;

public class Bem {
    private int codigo;
    private String nome;
    private float valor;

    public Bem(int codigo, String nome, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }
}
