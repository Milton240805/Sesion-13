// Si se presiona un boton, agrega uno al campo de texto y asi sucesivamente
//para todos los otros botones
else if (source == buttonUno) {
    campoTexto.setText(campoTexto.getText() + "1");
} else if (source == buttonDos) {
    campoTexto.setText(campoTexto.getText() + "2");
} else if (source == buttonTres) {
    campoTexto.setText(campoText.getText() + "3");
} else if (source == buttonCuatro) {
    campoTexto.setText(campoTexto.getText() + "4");
} else if (source == buttonCinco) {
    campoTexto.setText(campoTexto.getText() + "5");
} else if (source == buttonSeis) {
    campoTexto.setText(campoTexto.getText() + "6");
} else if (source == buttonSiete) {
    campoTexto.setText(campoTexto.getText() + "7");
} else if (source == buttonOcho) {
    campoTexto.setText(campoTexto.getText() + "8");
} else if (source == buttonNueve) {
    campoTexto.setText(campoTexto.getText() + "9");
} else if (source == buttonPunto) {
    if (campoTexto.getText().contains(".")) { //If the text field contains a dot, do nothing
        return;
    } else {
        campoTexto.setText(campoTexto.getText() + "."); // If the text field does not contain a dot, add a dot
    }

}
// Si se presiona al boton mas, agrega uno mas al campo de texto y asi
// sucesivamente para todos los botones
else if (source == buttonSuma) {
    String str = campoTexto.getText();
    numero = Double.parseDouble(campoTexto.getText());
    campoTexto.setText("");
    etiqueta.setText(str + "+");
    calculo = 1;
} else if (source == buttonResta) {
    String str = campoTexto.getTexto.getText();
    numero = Double.parseDouble(campoTexto.getText());
    campoTexto.setText("");
    etiqueta.setText(str + "-");
    calculo = 2;
} else if (source == buttonMulti) {
    String str = campoTexto.getTexto.getText();
    numero = Double.parseDouble(campoTexto.getText());
    campoTexto.setText("");
    etiqueta.setText(str + "x");
    calculo = 3;
} else if (source == buttonDiv) {
    String str = campoTexto.getTexto.getText();
    numero = Double.parseDouble(campoTexto.getText());
    campoTexto.setText("");
    etiqueta.setText(str + "+");
    calculo = 4;
} else if (source == buttonRaiz) {
    String str = campoTexto.getTexto.getText();
    numero = Double.parseDouble(campoTexto.getText());
    Double sqrt = Math.sqrt(numero);
    campoTexto.setText(Double.toString(sqrt));

} else if (source == buttonCuadrado) {
    String str = campoTexto.getText();
    numero = Double.parseDouble(campoTexto.getText());
    double square = Math.pow(numero, 2);
    String string = Double.toString(square);
    if (string.endsWith(".0")) {
        campoTexto.setText(string.replace(".0", ""));
    } else {
        campoTexto.setText(string)
    }
    etiqueta.setText("(raiz)" + str);
}