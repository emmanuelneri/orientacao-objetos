package br.com.emmanuelneri.grafico.produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroForm {

    private JPanel panel;

    private JTextField campoCodigo;
    private JTextField campoNome;
    private JButton botaoImprimir;
    private JButton botaoLimpar;

    private Produto produto = new Produto();

    public CadastroForm() {
        botaoImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                produto.setCodigo(campoCodigo.getText());
                produto.setNome(campoNome.getText());
                produto.imprimir();
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                produto = new Produto();
                campoCodigo.setText(null);
                campoNome.setText(null);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
