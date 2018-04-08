package bens_InProgress.view;

import javax.swing.*;

public class MenuView extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private JPanel panelMain;
    private JButton consultarPessoaButton;
    private JButton excluirPessoaButton;
    private JButton listarPessoasButton;
    private JButton incluirPessoaButton;
    private JButton incluirBemButton;
    private JButton excluirBemButton;

    public MenuView() {
        setSize(WIDTH, HEIGHT);
        setContentPane(panelMain);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JButton getConsultarPessoaButton() {
        return consultarPessoaButton;
    }

    public JButton getExcluirPessoaButton() {
        return excluirPessoaButton;
    }

    public JButton getListarPessoasButton() {
        return listarPessoasButton;
    }

    public JButton getIncluirPessoaButton() {
        return incluirPessoaButton;
    }

    public JButton getIncluirBemButton() {
        return incluirBemButton;
    }

    public JButton getExcluirBemButton() {
        return excluirBemButton;
    }

}
