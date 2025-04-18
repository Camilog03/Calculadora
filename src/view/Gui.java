package view;

import controller.Controller;
import model.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements CalculadoraInterface {
    JTextField num1, num2;
    public static JButton botonSumar, botonRestar;
    FlowLayout flowLayout;
    Container container;

    public Gui(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = getContentPane();

        flowLayout = new FlowLayout();
        container.setLayout(flowLayout);

        num1 = new JTextField(5);
        container.add(num1);
        num2 = new JTextField(5);
        container.add(num2);

        botonSumar = new JButton("Sumar");
        container.add(botonSumar);
        botonRestar = new JButton("Restar");
        container.add(botonRestar);
    }

    @Override
    public int getNum1() {
        return Integer.parseInt(num1.getText());
    }

    @Override
    public int getNum2() {
        return Integer.parseInt(num2.getText());
    }

    @Override
    public void mostrarResultado(int resultado) {
        JOptionPane.showMessageDialog(this, resultado);
    }

    @Override
    public void iniciar(Controller controller) {
        setVisible(true);
        botonSumar.addActionListener(controller);
        botonRestar.addActionListener(controller);
    }
}

