package br.com.emmanuelneri.grafico.produto;

import javax.swing.*;

public class CadastroProdutoView {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Cadastro de Produto");

        CadastroForm cadastroForm = new CadastroForm();

        jFrame.setContentPane(cadastroForm.getPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.pack();
    }

}
