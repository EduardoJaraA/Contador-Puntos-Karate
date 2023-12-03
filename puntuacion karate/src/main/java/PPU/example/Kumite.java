package PPU.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Kumite extends JDialog {
    private JButton añadirIponAkaButton;
    private JButton añadirShuiAkaButton;
    private JPanel Contenedor;
    private JLabel puntacion_contar_aka;
    private JButton limpiarButon;
    private JLabel puntacion_contar_shiro;

    public Kumite() {
        setContentPane(Contenedor);
        setModal(true);
        setSize(600,450);


        añadirIponAkaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iponAka();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                limpiarButon();
                dispose();
            }
        });
        limpiarButon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarButon();
            }
        });
    }
    private static int puntos_aka=0;
    private static int puntos_shiro=0;

    private void iponAka() {
        puntos_aka++;
       puntacion_contar_aka.setText(String.valueOf( +puntos_aka));

    }

    private void iponshiro() {
        puntos_shiro++;
        puntacion_contar_aka.setText(String.valueOf( +puntos_shiro));

    }

    private void limpiarButon(){
        puntos_shiro=0;
        puntos_aka=0;
        puntacion_contar_aka.setText(String.valueOf( +puntos_aka));
        //puntacion_contar_shiro.setText(String.valueOf( +puntos_shiro));
    }


}

