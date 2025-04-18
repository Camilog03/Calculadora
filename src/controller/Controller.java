package controller;

import model.Calculadora;
import view.CalculadoraInterface;
import view.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Calculadora calculadora;
    CalculadoraInterface calculadoraInterface;
    Operacion operacion;


    public Controller(Calculadora calculadora, CalculadoraInterface calculadoraInterface) {
        this.calculadora = calculadora;
        this.calculadoraInterface = calculadoraInterface;
    }

    public void iniciarMVC() {
        calculadoraInterface.iniciar(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculadora.setNum1(calculadoraInterface.getNum1());
        calculadora.setNum2(calculadoraInterface.getNum2());

        if (e.getSource() == Gui.botonSumar) {
            operacion = Operacion.SUMAR;
        }
        else if (e.getSource() == Gui.botonRestar) {
            operacion = Operacion.RESTAR;
        }

        int resultado = 0;

        if (operacion == Operacion.SUMAR) {
            resultado = calculadora.sumar();
        }
        else if (operacion == Operacion.RESTAR) {
            resultado = calculadora.restar();
        }

        calculadoraInterface.mostrarResultado(resultado);
    }
}
