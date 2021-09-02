package br.com.pitagras.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Calculadora {
    private JTextField jLabelResultado;
    private JLabel jLabelValorA;
    private JLabel jLabelValorB;

    private JTextField jTextFieldValorA;
    private JTextField jTextFieldValorB;

    private JButton jButtonAdd;
    private JButton jButtonSub;
    private JButton jButtonMul;
    private JButton jButtonDiv;
    private JButton jButtonClear;

    public Calculadora() {
        JFrame jFrameTelaPrincipal = new JFrame("Calculadora Simples");
        jFrameTelaPrincipal.setLayout(null);
        jFrameTelaPrincipal.setSize(300, 400);

        // Instância dos componentes
        jLabelResultado = new JTextField("Resultado");
        jLabelResultado.setEditable(false);
        jLabelValorA = new JLabel("Valor A:");
        jLabelValorB = new JLabel("Valor B:");

        jTextFieldValorA = new JTextField();
        jTextFieldValorB = new JTextField();

        jButtonAdd = new JButton("+");
        jButtonSub = new JButton("-");
        jButtonMul = new JButton("*");
        jButtonDiv = new JButton("/");
        jButtonClear = new JButton("Limpar");

        jLabelResultado.setBounds(10, 10, 280, 20);
        jLabelResultado.setBackground(new Color(255, 0, 0));

        jLabelValorA.setBounds(10, 30, 50, 20);
        jTextFieldValorA.setBounds(65, 30, 220, 20);

        jLabelValorB.setBounds(10, 55, 50, 20);
        jTextFieldValorB.setBounds(65, 55, 220, 20);

        jButtonAdd.setBounds(60, 80, 50, 50);
        jButtonSub.setBounds(110, 80, 50, 50);
        jButtonMul.setBounds(160, 80, 50, 50);
        jButtonDiv.setBounds(210, 80, 50, 50);

        jButtonClear.setBounds(60, 135, 200, 50);

        jButtonClear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        acaoBotaoLimpar();
                    }
                }
        );

        jButtonAdd.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );

        jButtonSub.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
//                        acaoBotaoSub();
                        executarOperacao(actionEvent.getActionCommand());
                    }
                }
        );


        jFrameTelaPrincipal.add(jLabelResultado);
        jFrameTelaPrincipal.add(jLabelValorA);
        jFrameTelaPrincipal.add(jTextFieldValorA);
        jFrameTelaPrincipal.add(jLabelValorB);
        jFrameTelaPrincipal.add(jTextFieldValorB);
        jFrameTelaPrincipal.add(jButtonAdd);
        jFrameTelaPrincipal.add(jButtonSub);
        jFrameTelaPrincipal.add(jButtonMul);
        jFrameTelaPrincipal.add(jButtonDiv);
        jFrameTelaPrincipal.add(jButtonClear);
        jFrameTelaPrincipal.setResizable(false);
        jFrameTelaPrincipal.setVisible(true);
        jFrameTelaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void executarOperacao(String actionCommand) {
        BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
        BigDecimal resultado;
        switch (actionCommand) {
            case "+":
                resultado = valorA.add(valorB);
                jLabelResultado.setText("" + resultado);
                break;
            case "-":
                resultado = valorA.subtract(valorB);
                jLabelResultado.setText("" + resultado);
                break;

        }
    }

//    private void acaoBotaoAdd() {
//        BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
//        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
//        BigDecimal resultado = valorA.add(valorB);
//        jLabelResultado.setText("" + resultado);
//    }
//
//    private void acaoBotaoSub() {
//        BigDecimal valorA = new BigDecimal(jTextFieldValorA.getText());
//        BigDecimal valorB = new BigDecimal(jTextFieldValorB.getText());
//        BigDecimal resultado = valorA.add(valorB);
//        jLabelResultado.setText("" + resultado);
//    }

    private void acaoBotaoLimpar() {
        jLabelResultado.setText("Informe os valores para realizar a operação");
        jTextFieldValorA.setText("");
        jTextFieldValorB.setText("");
    }
}
