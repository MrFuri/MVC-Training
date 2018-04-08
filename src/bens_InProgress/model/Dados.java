package bens_InProgress.model;

import lib.listas.Lista;
import lib.listas.VetorLista;

import java.security.InvalidParameterException;


public class Dados {
    private VetorLista<Pessoa> listaPax;

    public Dados() {
        this.listaPax = new VetorLista<>();
    }

    public boolean IncluirPessoa(int codigo, String nome) {
        if (!isPessoaValid(codigo))
            throw new InvalidParameterException("Codigo ja existe");
        else {
            this.listaPax.add(new Pessoa(codigo, nome));
            return true;
        }
    }

    public boolean ExcluirPessoa(int codigo) {
        this.listaPax.remove(this.getPessoa(codigo));
        return true;
    }

    public Pessoa ConsultarPessoa(int codigo) {
        return this.listaPax.getElement(this.getPessoa(codigo));
    }

    public Lista<Pessoa> ListarPessoas() {
        return this.listaPax;
    }

    public void IncluirBem(int codigoPessoa, int codigoBem, String nomeBem, float valor) {
        this.getPessoa(codigoPessoa).AddBem(codigoBem, nomeBem, valor);
    }

    public void ExcluirBem(int codigoPessoa, int codigoBem) {
        this.getPessoa(codigoPessoa).RemoveBem(codigoBem);
    }

    /*Método pode dar erro ao fazer o foreach
 pois removi durante o mesmo*/

    private Pessoa getPessoa(int codigo) {
        for (Pessoa pessoa :
                this.listaPax) {
            if (codigo == pessoa.getCodigo()) return pessoa;
        }
        throw new InvalidParameterException("Pessoa não encontrada");
    }

    private boolean isPessoaValid(int codigo) {
        for (Pessoa pessoa :
                this.listaPax) {
            if (codigo == pessoa.getCodigo())
                return false;
        }
        return true;
    }
}
