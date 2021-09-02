package br.com.pitagras;

import br.com.pitagras.view.Calculadora;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora();
            }
        });
    }
}
