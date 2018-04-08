package bens_InProgress.controller;

import bens_InProgress.model.Pessoa;
import lib.listas.VetorLista;

import java.security.InvalidParameterException;

public class PessoaControl {

    public static boolean IncluirPessoa(String codigo, String nome) {
        if (!isPessoaValid(Integer.parseInt(codigo)))
            return false;
        else {
            Pessoa.getPessoas().add(new Pessoa(Integer.parseInt(codigo), nome));
            return true;
        }
    }

    public static boolean ExcluirPessoa(int codigo) {
        Pessoa.getPessoas().remove(getPessoa(codigo));
        return true;
    }

    /**
     * @return array de string
     * @implSpec Metodo que mapeia uma lib.listas de pessoas para retornar um
     * array de string
     */
    public static VetorLista<String[]> ListarPessoas() {
        VetorLista<String[]> paxString = new VetorLista<>();
        for (Pessoa x :
                Pessoa.getPessoas()) {
            paxString.add(new String[]{String.valueOf(x.getCodigo()), x.getNome()});
        }
        return paxString;
    }

    private static Pessoa getPessoa(int codigo) {
        for (Pessoa pessoa :
                Pessoa.getPessoas()) {
            if (codigo == pessoa.getCodigo()) return pessoa;
        }
        throw new InvalidParameterException("Pessoa não encontrada");
    }

    private static boolean isPessoaValid(int codigo) {
        for (Pessoa pessoa :
                Pessoa.getPessoas()) {
            if (codigo == pessoa.getCodigo())
                return false;
        }
        return true;
    }

    public Pessoa ConsultarPessoa(int codigo) {
        return Pessoa.getPessoas().getElement(getPessoa(codigo));
    }

    /*Método pode dar erro ao fazer o foreach
 pois removi durante o mesmo*/

    public void IncluirBem(int codigoPessoa, int codigoBem, String nomeBem, float valor) {
        getPessoa(codigoPessoa).AddBem(codigoBem, nomeBem, valor);
    }

    public void ExcluirBem(int codigoPessoa, int codigoBem) {
        getPessoa(codigoPessoa).RemoveBem(codigoBem);
    }
}
