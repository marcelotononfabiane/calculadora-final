package modelo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MenuCalculadora {
    static Integer valueMenu = 0;
    static Scanner teclado = new Scanner(System.in);
    private static Object Interger;
    private static Object entrada;
    private static Object emtrada;
    private static Object calculadora;
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        while(valueMenu != 6){
            if(valueMenu == 1){
                Float number1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 1"));
                Float number2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 2"));                
                calculadora.setValue1 (number1);
                calculadora.setValue2 (number2);
                calculadora.soma();
                chamarMenu();                
            } else if(valueMenu == 2) {
                Float number1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 1"));
                Float number2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 2"));                
                calculadora.setValue1 (number1);
                calculadora.setValue2 (number2);
                calculadora.subtract();
                chamarMenu();                
            } else if(valueMenu == 3) {
                Float number1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 1"));
                Float number2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 2"));                
                calculadora.setValue1 (number1);
                calculadora.setValue2 (number2);
                calculadora.multiply();
                chamarMenu();                
            } else if (valueMenu == 4) {
                Float number1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 1"));
                Float number2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o value 2"));                
                calculadora.setValue1 (number1);
                calculadora.setValue2 (number2);
                calculadora.div();
                chamarMenu();                
            } else if (valueMenu == 5) {
                System.out.println(calculadora.getResults());
                chamarMenu();
            } else if (valueMenu == 6) {
                System.exit(0);
            } else {
                chamarMenu();
            }
        }
    }
    static {   
    }    
        private static void chamarMenu() {
        System.out.println ("#####################");
        System.out.println (" MENU");
        System.out.println (" 1:ADICÃO");
        System.out.println (" 2:SUBTRAÇÃO");
        System.out.println (" 3:MULTIPLICAÇÃO");
        System.out.println (" 4:DIVISÃO");
        System.out.println (" 5:IMPRIMIR");
        System.out.println (" 6:SAIR");
        System.out.println ("#####################");
        valueMenu = teclado.nextInt();
        }
}
