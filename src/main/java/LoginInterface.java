import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginInterface extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginInterface() {
        setTitle("CONTROL-STOCK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel titleLabel = new JLabel("CONTROL-STOCK", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Aquí puedes agregar la lógica para verificar el nombre de usuario y contraseña
                // y realizar las acciones correspondientes

                if (username.equals("admin") && password.equals("admin123")) {
                    JOptionPane.showMessageDialog(LoginInterface.this, "Login successful");
                    // Aquí puedes abrir la interfaz principal o realizar otras acciones
                } else {
                    JOptionPane.showMessageDialog(LoginInterface.this, "Invalid username or password");
                }
            }
        });

        add(titleLabel);
        add(new JLabel()); // Espacio vacío
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Espacio vacío
        add(loginButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface();
            }
        });
    }
}