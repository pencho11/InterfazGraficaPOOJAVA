package opciones.operacionesmatematicas;

import menu.Menu;
import javax.swing.*;
import java.awt.*;


public class OperacionesMatematicas extends JFrame {

    private JPanel operacionesmatematicas;
    private JTextField txtNumero2;
    private JTextField txtNumero1;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMultiplica;
    private JButton btnDivide;
    private JButton btnSalir;
    private JLabel lblResultado;

    public OperacionesMatematicas(){

            add(operacionesmatematicas);
            setTitle("Opcion de operaciones Matematicas.");
            setSize(500,600);
        btnSalir.addActionListener(e -> {
                Menu menu= new Menu();
                menu.setVisible(true);
                esconderVentana();
        });
    }
    private void esconderVentana(){
        this.dispose();
    }


}
