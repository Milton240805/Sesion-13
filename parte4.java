public void addActionEvent() {
    buttonON.addActionListener(this);
    buttonOFF.addActionListener(this);
    buttonLimpiar.addActionListener(this);
    buttonBorrar.addActionListener(this);
    buttonDiv.addActionListener(this);
    buttonRaiz.addActionListener(this);
    buttonCuadrado.addActionListener(this);
    buttonReciprocal.addActionListener(this);
    buttonResta.addActionListener(this);
    buttonSiete.addActionListener(this);
    buttonOcho.addActionListener(this);
    buttonNueve.addActionListener(this);
    buttonMulti.addActionListener(this);
    buttonCuatro.addActionListener(this);
    buttonCinco.addActionListener(this);
    buttonSeis.addActionListener(this);
    buttonSuma.addActionListener(this);
    buttonUno.addActionListener(this);
    buttonDos.addActionListener(this);
    buttonTres.addActionListener(this);
    buttonIgual.addActionListener(this);
    buttonCero.addActionListener(this);
    buttonPunto.addActionListener(this);
}

// Metodo para agregar todos los metodos escucha a los botones y al marco.
@Override
public void actionPerformed(ActionEvent e){
    Object source = e.getSource();

    // Si se selecciona de opcion ON, la calculadora esta habilitada.
    if (source == buttonON) {
        enable();
    } 
    // Si se selecciona el boton de radio OFF, la calculadora se desactiva
    else if (source == buttonOFF) {
        disable();
    }
    // Si se presiona el boton de radio OFF, la calculadora se desactiva
    else if (source == buttonOFF) {
        disable();
    }
    // Si se presiona el boton borrar, el campo de texto se borra
    else if (source == buttonLimpiar) {
        etiqueta.setText("");
        campoTexto.setText("");
    }
    // Si se presiona el boton Eliminar, se elimina el ultimo caracter.
    else if (source == buttonBorrar) {
        int length = campoTexto.getText().length(); // Obtener la longitud del campo de texto
        int numero = length -1; //Obtener el numero de caracteres a eliminar

        if (length > 0) {// Si la longitud es mayor que 0, elimine el ultimo caracter.
            StringBulider back = new StringBuilder(campoTexto.getTexto());
            back.deleteCharAt(numero);
            campoTexto.setText(back.toString());
            
            
        }
        if (campoTexto.getText().endsWith("")) { // Si el campo de texto esta vacio, establezca la etiqueta en 0
            etiqueta.setText("");
        }
    } else if (source == buttonCero) {// Si se presiona el boton cero, agregue un cero al campo de texto
        if (campoTexto.getText().equals("0")) { // Si el campo de texto es 0, no hagas nada.
            return;
        } else { // Si el campo de texto no esta vacio, agregue un cero al campo de texto.
            campoTexto.setText(campoText() + "0");
        }
    }
}