import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testForm extends JDialog{
    private JPanel panel1;
    private JButton loginButton;
    private JButton registerButton;

    public testForm(JFrame parent)  {
        super(parent);
        setTitle("USA Car import calculator");
        setContentPane(panel1);
        setMinimumSize(new Dimension(1000, 860));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                loginForm loginForm = new loginForm(null);

            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                registerForm registerForm = new registerForm(null);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        testForm testForm = new testForm(null);
    }
}
