package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {
        setTitle("Menú Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        JButton btnListar = new JButton("Listar Vehículos");
        JButton btnAgregar = new JButton("Agregar Vehículo");

        panel.add(btnListar);
        panel.add(btnAgregar);

        add(panel);

        btnListar.addActionListener(e -> {
            ListarVehiculosView listarView = new ListarVehiculosView();
            listarView.setVisible(true);
        });

        btnAgregar.addActionListener(e -> {
            System.out.println("Abrir ventana de alta vehículo");
        });
    }
}