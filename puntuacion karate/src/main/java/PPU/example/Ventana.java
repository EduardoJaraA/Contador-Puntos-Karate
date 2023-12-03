/*
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);*\\
        */


package PPU.example;

import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JDialog {
    private JPanel contentPane;

    private JButton kumiteButton;
    private JButton kataButton;

    public Ventana() {
        setContentPane(contentPane);
        setModal(true);
        setSize(500,500);


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        kumiteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kumites();
            }});
        kataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kataBace();
            }});
    }

    private void kataBace() {
        //Kata katas=new Kata();
        //katas.setVisible(true);
    }

    private void kumites() {
        Kumite combates=new Kumite();
        combates.setVisible(true);

    }
}