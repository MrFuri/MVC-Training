package bens_InProgress.view;

import javax.swing.*;

public class IncluirPessoaView extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    private JPanel incluirPessoaPanel;
    private JTextField codigoTextField;
    private JTextField nomeTextField;
    private JButton salvarPessoaButton;

    public IncluirPessoaView() {
        setSize(WIDTH, HEIGHT);
        setContentPane(incluirPessoaPanel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public JTextField getCodigoTextField() {
        return codigoTextField;
    }

    public JTextField getNomeTextField() {
        return nomeTextField;
    }

    public JButton getSalvarPessoaButton() {
        return salvarPessoaButton;
    }

}