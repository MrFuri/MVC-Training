package bens_InProgress.controller;

import bens_InProgress.view.IncluirPessoaView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.InvalidParameterException;

public class IncluirPessoaController {
    private IncluirPessoaView incluirPessoaView;
    private JTextField codigoTextField;
    private JTextField nomeTextField;
    private JButton salvarPessoaButton;

    public IncluirPessoaController() {
        initComponents();
        initListeners();
    }

    public void show() {
        incluirPessoaView.setVisible(true);
    }

    private void initComponents() {
        incluirPessoaView = new IncluirPessoaView();
        salvarPessoaButton = incluirPessoaView.getSalvarPessoaButton();
        codigoTextField = incluirPessoaView.getCodigoTextField();
        nomeTextField = incluirPessoaView.getNomeTextField();
    }

    private void initListeners() {
        salvarPessoaButton.addActionListener(new SalvarPessoaListener());
    }

    private class SalvarPessoaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (PessoaControl.IncluirPessoa(codigoTextField.getText(), nomeTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Pessoa incluida");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao incluir");
                throw new InvalidParameterException("Codigo ja existe");
            }
        }
    }
}
