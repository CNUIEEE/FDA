import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FDAGUI {
    public static JTextField testField, kField;
    public static JLabel testLabel;
    public static GridLayout grid = new GridLayout(3, 3);

    public FDAGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());

        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Something Awesome IDK");

        JPanel panelTop = new JPanel();
        JPanel panelMiddle = new JPanel();
        JPanel panelBottom = new JPanel();
        panelTop.setLayout(grid);
        panelMiddle.setLayout(grid);
        panelBottom.setLayout(grid);

        frame.add(panelTop);
        frame.add(panelMiddle);
        frame.add(panelBottom);

        frame.add(panel);

        testField = new JTextField("text", 30);

        panelMiddle.add(testField);

        kField = new JTextField(30);
        panelMiddle.add(kField);

        JButton button = new JButton("Poke Me");
        button.addActionListener(new ClearListener());
        panelMiddle.add(button);

        testLabel = new JLabel("Name");
        panelTop.add(testLabel);

    }

    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println("WORK");
            FDAGUI.testField.setText("");

        }
    }

    public static void main(String args[]) {
        FDAGUI gui = new FDAGUI();

    }
}
