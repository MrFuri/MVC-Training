package bens_InProgress.model;

import lib.listas.LkdList;
import lib.listas.VetorLista;

import java.security.InvalidParameterException;

public class Pessoa {
    public static VetorLista<Pessoa> listaPax = new VetorLista<>();
    private int codigo;
    private String nome;
    private LkdList<Bem> listBem;

    public Pessoa() {
        this.listBem = new LkdList<>();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public static VetorLista<Pessoa> getPessoas() {
        return listaPax;
    }

    public void AddBem(int codigo, String nome, float valor) {
        this.listBem.add(new Bem(codigo, nome, valor));
    }

    public void RemoveBem(int codigo) {
        this.listBem.remove(this.getBemByCode(codigo));
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

    private Bem getBemByCode(int codigo) {
        for (Bem bem :
                this.listBem) {
            if (codigo == bem.getCodigo()) {
                return bem;
            }
        }
        throw new InvalidParameterException("Bem invalido");
    }
}
