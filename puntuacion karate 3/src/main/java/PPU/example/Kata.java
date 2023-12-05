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
    private JTextField  juez1;
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
    private JLabel puntajeFin;


    public Kata() {
        setContentPane(visualKata);
        puntos_3_jueses.setVisible(false);
        puntos_5_jueses.setVisible(false);
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
        sumarButton.addActionListener(e -> sumaPuntos());

    }
    public static List<Float> puntuacion_jueses=new ArrayList<>();

    private void tresjuesesin() {
        puntos_5_jueses.setVisible(false);
        puntos_3_jueses.setVisible(true);
    }

    private void cincojuesesin() {
        puntos_3_jueses.setVisible(true);
        puntos_5_jueses.setVisible(true);
    }

    private void sumaPuntos() {
        Float j1= Float.parseFloat(String.valueOf(juez1));
        Float j3= Float.parseFloat(String.valueOf(juez3));
        Float j2= Float.parseFloat(String.valueOf(juez2));
        Float j4= Float.parseFloat(String.valueOf(juez4));
        Float j5= Float.parseFloat(String.valueOf(juez5));

        puntuacion_jueses.add(j1);puntuacion_jueses.add(j2);puntuacion_jueses.add(j3);
        if(puntos_5_jueses.isVisible()){puntuacion_jueses.add(j5);puntuacion_jueses.add(j4);}

        float sumaTotal = puntuacion_jueses.stream().reduce(0f, Float::sum);
        float puntajeFinal=sumaTotal;
        if(puntos_5_jueses.isVisible()){


        float sumaMinMax = puntuacion_jueses.stream()
                .min(Float::compareTo)
                .orElse(0f)
                +puntuacion_jueses.stream()
                .max(Float::compareTo)
                .orElse(0f);

        puntajeFinal = sumaTotal-sumaMinMax;}
        puntajeFin.setText("puntaje final:  "+puntajeFinal );

    }


}