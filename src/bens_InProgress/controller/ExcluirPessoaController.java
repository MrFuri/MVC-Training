package bens_InProgress.controller;

import bens_InProgress.tableModel.PessoaTableModel;
import bens_InProgress.view.ExcluirPessoaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluirPessoaController {
    private ExcluirPessoaView excluirPessoaView;
    private JButton excluirPessoaButton;
    private JTable excluirPaxTable;
    private JScrollPane excluirTableScroll;
    private PessoaTableModel pessoaTableModel;

    public ExcluirPessoaController() {
        initComponents();
        initListeners();
    }

    private void initListeners() {
        excluirPessoaButton.addActionListener(new ExcluirPessoaListener());
    }

    private void initComponents() {
        excluirPessoaView = new ExcluirPessoaView();
        excluirPaxTable = excluirPessoaView.getExcluirPaxTable();
        excluirPessoaButton = excluirPessoaView.getExcluirPessoaButton();
        LoadTable();
    }

    private void LoadTable() {
        pessoaTableModel = new PessoaTableModel(PessoaControl.ListarPessoas());
        excluirPaxTable.setModel(pessoaTableModel);

        excluirPaxTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        excluirPaxTable.getColumnModel().getColumn(1).setPreferredWidth(250);
    }

    public void show() {
        excluirPessoaView.setVisible(true);
    }

    private class ExcluirPessoaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //ALGO AQUI

        }
    }
}