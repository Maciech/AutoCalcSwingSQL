import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JDialog{
    private JTextField textField1;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton loginButton;

    public loginForm(JFrame parent) {
        super(parent);
        setTitle("USA Car import calculator");
        setContentPane(panel1);
        setMinimumSize(new Dimension(1000, 860));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                registerForm registerForm = new registerForm(null);
            }
        });
        setVisible(true);
    }
}
