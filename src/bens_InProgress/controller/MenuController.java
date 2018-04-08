package bens_InProgress.controller;

import bens_InProgress.view.MenuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {
    private MenuView menuView;
    private JButton consultarPessoaButton;
    private JButton excluirPessoaButton;
    private JButton listarPessoasButton;
    private JButton incluirPessoaButton;
    private JButton incluirBemButton;
    private JButton excluirBemButton;
    private IncluirPessoaController incluirPessoaController;
    private ExcluirPessoaController excluirPessoaController;

    public MenuController() {
        initComponents();
        initListeners();
    }

    public void show() {
        menuView.setVisible(true);
    }

    private void initComponents() {
        menuView = new MenuView();
        incluirPessoaButton = menuView.getIncluirPessoaButton();
        excluirPessoaButton = menuView.getExcluirPessoaButton();
    }

    private void initListeners() {
        incluirPessoaButton.addActionListener(new IncluirBtnListener());
        excluirPessoaButton.addActionListener(new ExcluirBtnListener());
    }

    private class IncluirBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            incluirPessoaController = new IncluirPessoaController();
            incluirPessoaController.show();
        }
    }

    private class ExcluirBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            excluirPessoaController = new ExcluirPessoaController();
            excluirPessoaController.show();
        }
    }
}
