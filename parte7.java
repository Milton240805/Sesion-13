//metodo para habilitar la calculadora 
public void enable() {
    buttonON.setEnabled(false);
    buttonOFF.setEnabled(true);
    campoTexto.setEnabled(true);
    etiqueta.setEnabled(true);
    buttonLimpiar.setEnabled(true);
    buttonBorrar.setEnabled(true);
    buttonDiv.setEnabled(true);
    buttonRaiz.setEnabled(true);
    buttonCuadrado.setEnabled(true);
    buttonReciprocal.setEnabled(true);
    buttonResta.setEnabled(true);
    buttonSiete.setEnabled(true);
    buttonOcho.setEnabled(true);
    buttonNueve.setEnabled(true);
    buttonMulti.setEnabled(true);
    buttonCuatro.setEnabled(true);
    buttonCinco.setEnabled(true);
    buttonSeis.setEnabled(true);
    buttonSuma.setEnabled(true);
    buttonUno.setEnabled(true);
    buttonDos.setEnabled(true);
    buttonTres.setEnabled(true);
    buttonIgual.setEnabled(true);
    buttonCero.setEnabled(true);
    buttonPunto.setEnabled(true);

}

// metodo para desactivar la calculadora
public void disable() {
    buttonON.setEnabled(true);
    buttonOFF.setEnabled(false);
    campoTexto.setText("");
    etiqueta.setText(" ");
    buttonLimpiar.setEnabled(false);
    buttonBorrar.setEnabled(false);
    buttonDiv.setEnabled(false);
    buttonRaiz.setEnabled(false);
    buttonCuadrado.setEnabled(false);
    buttonReciprocal.setEnabled(false);
    buttonResta.setEnabled(false);
    buttonSiete.setEnabled(false);
    buttonOcho.setEnabled(false);
    buttonNueve.setEnabled(false);
    buttonMulti.setEnabled(false);
    buttonCuatro.setEnabled(false);
    buttonCinco.setEnabled(false);
    buttonSeis.setEnabled(false);
    buttonSuma.setEnabled(false);
    buttonUno.setEnabled(false);
    buttonDos.setEnabled(false);
    buttonTres.setEnabled(false);
    buttonIgual.setEnabled(false);
    buttonCero.setEnabled(false);
    buttonPunto.setEnabled(false);
}

public static void main(String[] args) {
    new Calculadora(); // create a new Calculator object
}