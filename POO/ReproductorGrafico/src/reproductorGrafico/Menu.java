package reproductorGrafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    ListaMultimedia lista = new ListaMultimedia(10);

    private JPanel mainPanel;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtInterprete;
    private JComboBox cbxFormato;
    private JTextField txtDuracion;
    private JTextField txtDistribuida;
    private JButton btnAgregar;
    private JButton btnVisualizar;
    private JButton btnSalir;
    private JTextArea txtArea;

    public Menu() {
        setTitle("Menu Principal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(810,770));
        setPreferredSize(new Dimension(670,700));
        setSize(670,700);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Leer contenido de los cuadros de texto
                String titulo = txtTitulo.getText();
                String autor = txtAutor.getText();
                String interprete = txtInterprete.getText();
                String formato = (String)cbxFormato.getSelectedItem();
                String duracionCadena = txtDuracion.getText();
                String añoCadena = txtDistribuida.getText();
                Double duracion = Double.valueOf(duracionCadena);
                Integer año = Integer.valueOf(añoCadena);

                //Agregar contenido a la lista
                if (formato == "mp4" || formato == "dvd"||formato =="mov"||formato=="mpg"){
                    lista.add(new Pelicula(titulo, autor,interprete,formato,duracion,año));
                }else{
                    lista.add(new Musica(titulo, autor,interprete,formato,duracion,año));
                }
                JOptionPane.showMessageDialog(null, "Registro Agregado");

                //Borrar contenido de los cuadros de texto
                txtTitulo.setText(null);
                txtAutor.setText(null);
                txtInterprete.setText(null);
                txtDuracion.setText(null);
                txtDistribuida.setText(null);
                txtTitulo.requestFocus();
            }
        });

        btnVisualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.append(lista.toString());
            }
        });
    }
}