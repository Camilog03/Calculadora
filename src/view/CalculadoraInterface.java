package view;

import controller.Controller;

public interface CalculadoraInterface {
    public int getNum1();

    public int getNum2();

    public void mostrarResultado(int resultado);

    public void iniciar(Controller controller);
}
