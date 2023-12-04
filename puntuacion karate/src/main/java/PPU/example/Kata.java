package PPU.example;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Kata extends JDialog{
    private JPanel visualKata;
    private JButton tresJueses;
    private JButton cincoJueses;
    private JPanel tres_jueses;
    private JTextField juez1;
    private JTextField juez2;
    private JTextField juez3;
    private JTextField juez4;
    private JTextField juez5;
    private JPanel puntos_3_jueses;
    private JPanel puntos_5_jueses;
    private JButton gana_aka;
    private JButton ganar_shiro;
    private JLabel ganadorPorBanderas;
    private JButton sumarButton;


    public Kata() {
        setContentPane(visualKata);
        setModal(true);
        setSize(500,500);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });


        tresJueses.addActionListener(e -> tresjuesesin());
        cincoJueses.addActionListener(e -> cincojuesesin());


    }
    public static List<Integer> puntuacion_jueses=new ArrayList<>();

    private void tresjuesesin() {
        sumaTres();
    }

    private void cincojuesesin() {
    }

    private void sumaTres() {
    }


}