else if (source == buttonReciprocal) {
    numero = Double.parseDouble(campoTexto.getText());
    double reciprocal = 1 / numero;
    String string = Double.toString(reciprocal);
    if (string.endsWith(".0")) {
        campoTexto.setText(string.replace(".0", ""));
    } else {
        campoTexto.setText(string);
    }
} else if (source == buttonIgual) {
    switch (calculo) {
    case 1:
        respuesta = numero + Double.parseDouble(campoTexto.getText());
        if (Double.toString(respuesta).endsWith(".0")) {
            campoTexto.setText(Double.toString(respuesta).replace(".0", ""));
        } else {
            campoTexto.setTexto.setText(Double.toString(respuesta));
        }
        etiqueta.setText("");
        break;
    case 2:
        respuesta = numero - Double.parseDouble(campoTexto.getText());
        if (Double.toString(respuesta).endsWith(".0")) {
            campoTexto.setText(Double.toString(respuesta).replace(".0", ""));
        } else {
            campoTexto.setText(Double.toString(respuesta));
        }
        etiqueta.setText("");
        break;
    case 3:
        respuesta = numero * Double.parseDouble(campoTexto.getText());
        if (Double.toString(respuesta).endswith(".0")) {
            campoTexto.setText(Double.toString(respuesta).replace(".0", ""));
        } else {
            campoTexto.setText(Double.toString(respuesta));
        }
        etiqueta.setText("");
        break;
    case 4: 
        respuesta = numero / Double.parseDouble(campoTexto.getText());
        if (Double.toString(respuesta).endsWith(".0")) {
            campoTexto.setText(Double.toString(respuesta).replace(".0", ""));
        } else {
            campoTexto.setText(Double.toString(respuesta));
        }
        etiqueta.setText("");
        break;

        
    }
}