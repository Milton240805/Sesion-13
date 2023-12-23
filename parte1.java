import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * @author Milton Dure
 */
class Calculadora implements ActionListener {

    double numero, respuesta;
    int calculo;

    JFrame marco;
    JLabel etiqueta = new JLabel ();
    JTextField campoTexto = new JTextField();
    JRadioButton buttonON = new JRadioButton("ON");
    JRadioButton buttonOFF = new JRadioButton("OFF");
    JButton buttonCero = new JButton("0");
    JButton buttonUno = new JButton("1");
    JButton buttonDos = new JButton("2");
    JButton buttonTres = new JButton("3");
    JButton buttonCuatro = new JButton("4");
    JButton buttonCinco = new JButton("5");
    JButton buttonSeis = new JButton("6");
    JButton buttonSiete = new JButton("7");
    JButton buttonOcho = new JButton("8");
    JButton buttonNueve = new JButton("9");
    JButton buttonPunto = new JButton(".");
    JButton buttonLimpiar = new JButton("C");
    JButton buttonBorrar = new JButton("DEL");
    JButton buttonIgual = new JButton("=");
    JButton buttonMulti = new JButton("x");
    JButton buttonDiv = new JButton("÷");
    JButton buttonSuma = new JButton("+");
    JButton buttonResta = new JButton("-");
    JButton buttonCuadrado = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonRaiz = new JButton("x\u221A");

    // Colores para la interfaz de usuario
    Color rosa = new Color(239, 71, 111);
    Color amarillo = new Color(255, 209, 102);
    Color verde = new Color(6, 214, 160);
    Color pastel = new Color(7, 59, 76);

    Calculadora() {
        prepararGUI();
        addComponentes();
        addActionEvent();
    }

    // Metodo para preparar la GUI
    public void prepararGUI() {
        marco = new JFrame();
        marco.setTitle("Calculadora LP1-23");
        marco.setSize(300, 490);
        marco.getContentPane().setLayout(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Metodo para agregar todos los componentes como los numeros y simbolos de
    //todos los operaciones a la GUI
    public void addComponentes() {
        etiqueta.setBounds(250, 0, 50, 50);
        etiqueta.setForeground(Color.black);
        marco.add(etiqueta);

        campoTexto.setBounds(10, 40, 270, 40);
        campoTexto.setFont(new Font("Arial", Font.BOLD, 20));
        campoTexto.setEditable(false);
        campoTexto.setHorizontalAlignment(SwingConstants.RIGHT);
        marco.add(campoTexto);
    }
}