import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registerForm extends JDialog {
    private JPanel registerPanel;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JButton button1;

    public registerForm(JFrame parent) {
        super(parent);
        setTitle("USA Car import calculator");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(1000, 860));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                loginForm loginForm = new loginForm(null);
            }
        });
        setVisible(true);
    }
}
