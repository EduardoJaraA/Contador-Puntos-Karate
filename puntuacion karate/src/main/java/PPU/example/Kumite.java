package PPU.example;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Kumite extends JDialog {
    private JPanel Contenedor;
    private JButton sumarIponAkaButton;
    private JButton sumarIponShiroButton;
    private JButton sumarShuiAkaButton;
    private JButton sumarShuiShiroButton;
    private JButton limpiarButon;
    private JLabel puntacion_contar_aka;
    private JLabel puntacion_contar_shiro;
    private JLabel shuis_contar_aka;
    private JLabel shuis_contar_shiro;


    public Kumite() {
        setContentPane(Contenedor);
        setModal(true);
        setSize(600,450);


        sumarIponAkaButton.addActionListener(e -> iponAka());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                limpiarButon();
                dispose();
            }
        });
        limpiarButon.addActionListener(e -> limpiarButon());
        sumarIponShiroButton.addActionListener(e -> iponshiro());
        sumarShuiAkaButton.addActionListener(e -> shuiAka());
        sumarShuiShiroButton.addActionListener(e -> shuiShiro());
    }
    public static int puntos_aka=0;
    public static int puntos_shiro=0;
    public static int shui_aka=0;
    public static int shui_shiro=0;

    private void iponAka() {
        puntos_aka++;
       puntacion_contar_aka.setText(String.valueOf( +puntos_aka));

    }

    private void iponshiro() {
        puntos_shiro++;
        puntacion_contar_shiro.setText(String.valueOf( +puntos_shiro));

    }

    private void shuiAka() {
        shui_aka++;
        shuis_contar_aka.setText(String.valueOf( +shui_aka));

    }

    private void shuiShiro() {
        shui_shiro++;
        shuis_contar_shiro.setText(String.valueOf( +shui_shiro));

    }

    private void limpiarButon(){
        puntos_shiro=0;
        puntos_aka=0;
        shui_aka=0;
        shui_shiro=0;
        puntacion_contar_aka.setText(String.valueOf( +puntos_aka));
        puntacion_contar_shiro.setText(String.valueOf( +puntos_shiro));
        shuis_contar_aka.setText(String.valueOf( +shui_aka));
        shuis_contar_shiro.setText(String.valueOf( +shui_shiro));
    }


    public static void ganador(){


    }
}
