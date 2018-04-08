package bens_InProgress.tableModel;

import lib.listas.Lista;
import lib.listas.VetorLista;

import javax.swing.table.AbstractTableModel;

public class PessoaTableModel extends AbstractTableModel {
    private static final int CODIGO = 0;
    private static final int NOME = 1;
    private Lista<String[]> linhas;
    private String[] colunas = new String[]{"Código", "Nome"};

    public PessoaTableModel() {
        linhas = new VetorLista<String[]>();
    }

    public PessoaTableModel(VetorLista<String[]> listaPessoas) {
        this.linhas = listaPessoas;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int colunaIndex) {
        return colunas[colunaIndex];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        switch (i) {
            case CODIGO:
                return String.class;
            case NOME:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("i out of bounds");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        String[] pessoa = linhas.get(linha);
        switch (coluna) {
            case CODIGO:
                return pessoa[CODIGO];
            case NOME:
                return pessoa[NOME];
            default:
                throw new IndexOutOfBoundsException("coluna out of bounds");
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        String[] pessoa = linhas.get(linha);
        switch (coluna) {
            case CODIGO:
                pessoa[CODIGO] = (String) valor;
                break;
            case NOME:
                pessoa[NOME] = (String) valor;
                break;
            default:
                throw new IndexOutOfBoundsException("coluna out of bounds");
        }
        fireTableCellUpdated(linha, coluna);
    }

    public String[] getPessoa(int index) {
        return linhas.get(index);
    }

    public void addPessoa(String[] pessoa) {
        linhas.add(pessoa);
        int ultimoIndex = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndex, ultimoIndex);
    }

    public void excluirPessoa(int index) {
        linhas.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return linhas.size() == 0;
    }

}
