package menu;

import static clases.constantes.MatematicasString.TITULO;
import opciones.OperacionesMatematicas;

import javax.swing.*;
import java.awt.*;

public class Menu extends Frame {
    private JPanel menuprincipal;
    private JButton btnOperaciones;

    public Menu(){
        add(menuprincipal);
        setTitle(TITULO.getTexto());
        setSize(500,600);
        btnOperaciones.addActionListener(e -> {
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderVentana();

        });
    }

    private void esconderVentana(){
        this.dispose();
    }


}
