import controller.Controller;
import model.Calculadora;
import view.CalculadoraInterface;
import view.Gui;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora model = new Calculadora();
        CalculadoraInterface gui = new Gui(); //Gui as interface
        //CalculadoraInterface terminal = new Terminal(); //Terminal as interface
        Controller controller = new Controller(model, gui);
        controller.iniciarMVC();

    }
}