package opciones;


import clases.operaciones.MatematicasLogica;
import menu.Menu;
import javax.swing.*;
import java.awt.*;


public class OperacionesMatematicas extends Frame {

    MatematicasLogica matematicasLogica = new MatematicasLogica();

    protected JPanel operacionesmatematicasform;
    protected JTextField txtNumero2;
    protected JTextField txtNumero1;
    protected JButton btnSuma;
    protected JButton btnResta;
    protected JButton btnMultiplica;
    protected JButton btnDivide;
    protected JButton btnSalir;
    protected JLabel lblResultado;

    public OperacionesMatematicas(){

            add(operacionesmatematicasform);
            setTitle("Opcion de operaciones Matematicas.");
            setSize(500,600);
        btnSalir.addActionListener(e -> {
                Menu menu= new Menu();
                menu.setVisible(true);
                esconderVentana();
        });
        btnSuma.addActionListener(e -> {
        datos(txtNumero1.getText(),txtNumero2.getText());

            lblResultado.setText(String.valueOf(matematicasLogica.calcularSuma()));
        });

        btnResta.addActionListener(e -> {
        datos(txtNumero1.getText(),txtNumero2.getText());

            lblResultado.setText(String.valueOf(matematicasLogica.calcularSuma()));
        });
    }
    private void esconderVentana(){
        this.dispose();
    }

    private void datos(String valor1, String valor2){
        matematicasLogica.setNumero1(Double.parseDouble(valor1));
        matematicasLogica.setNumero2(Double.parseDouble(valor2));
        lblResultado.setVisible(true);
    }
}
