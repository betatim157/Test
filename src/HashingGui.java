import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HashingGui extends JFrame {

    private JPanel mainpanel;

    private String Schluessel;
    private JLabel Titel;
    private JLabel Ausgabe;

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    private JTextField tSchluessel;
    private JTextField tWert;

    public HashingGui() {
        setTitle("HashingGui");
        setSize(new Dimension(400,300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainpanel);
        tSchluessel.setText("Schlüssel");
        tWert.setText("Wert");
        HashSuche s = new HashSuche();
        s.fuegeEin(332,30);
        s.showarray();
        System.out.println(s.schluesselvorhanden(322));
        System.out.println(s.suchePositionVon(322));
        System.out.println(s.gibWertVon(322));


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Ausgabe.removeAll();
              Ausgabe.setText(s.schluesselvorhanden(Integer.parseInt(tSchluessel.getText())));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        tSchluessel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tSchluessel.setText("");
            }
        });
        tWert.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tWert.setText("");
            }
        });
    }
    public static void main(String[] args) {
        new HashingGui();
    }
}
