package bens_InProgress.view;

import javax.swing.*;

public class ExcluirPessoaView extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private JPanel excluirPessoaPanel;
    private JButton excluirPessoaButton;
    private JTable excluirPaxTable;
    private JScrollPane excluirTableScroll;

    public ExcluirPessoaView() {
        setSize(WIDTH, HEIGHT);
        setContentPane(excluirPessoaPanel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public JTable getExcluirPaxTable() {
        return excluirPaxTable;
    }

    public JButton getExcluirPessoaButton() {
        return excluirPessoaButton;
    }

    public JScrollPane getExcluirTableScroll() {
        return excluirTableScroll;
    }
}
