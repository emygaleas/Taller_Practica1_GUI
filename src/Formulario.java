import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
    private JPanel Principal;
    private JTextField apellido;
    private JTextField nombre;
    private JTextField direccion;
    private JTextField telefono;
    private JTextField anioNacimiento;
    private JTextField estatura;
    private JButton BUTTONmostrarEnFormulario;
    private JButton BUTTONmostrarDatos;
    private JLabel datosFormulario;

    public Formulario(){
        setTitle("FORMULARIO DATOS PERSONALES");
        setSize(600,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(Principal);
        setVisible(true);


        BUTTONmostrarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = obtenerDatos();
                JOptionPane.showMessageDialog(null,datos);
            }
        });

        BUTTONmostrarEnFormulario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String datos = obtenerDatos();
                String datos2 = "<html>" + datos.replace("\n","<br>") + "<html>";
                datosFormulario.setText(datos2);
            }
        });

    }
    // "<html> <br> Nombre: <br> Apellido: <br> Dirección: <br> Teléfono: <br> Año de nacimiento: <br> Estatura:     metros <html>"

    private String obtenerDatos() {
        return "Nombre: " + nombre.getText() + "\n" + "Apellido: " + apellido.getText() + "\n" + "Dirección: " + direccion.getText() + "\n" +
                "Teléfono: " + telefono.getText() + "\n" + "Año de nacimiento: " + anioNacimiento.getText() + "\n" + "Estatura: " + estatura.getText() + " metros.";
    }


}
