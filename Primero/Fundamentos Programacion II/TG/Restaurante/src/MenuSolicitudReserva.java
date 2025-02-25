package src;

import javax.swing.*;
import java.awt.*;

public class MenuSolicitudReserva extends JFrame {
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton comprobarButton;
    private JPanel PanelA;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton button1;
    private JButton button2;

    public MenuSolicitudReserva() {
        setContentPane(PanelA);
        setTitle("Solicitud Reserva");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MenuSolicitudReserva frame = new MenuSolicitudReserva();
    }

}
