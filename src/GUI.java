import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    // Declare variables early on
    private int count = 0;
    private JLabel label;
    private JButton button;
    private JFrame frame;
    private JPanel panel;

    public GUI(){
        frame = new JFrame();

        // Create classes for ease-of-access

            //Button
            button = new JButton("Start");
            button.addActionListener(this);

            // Label
            label = new JLabel("Click Count: "+"No Clicks Yet");

        // Setting up the actual UI
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(1, 0));
        panel.add(button);
        panel.add(label);
        //
        // Paperwork-esk stuff
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PotionFiller Interface");
        frame.pack();
        frame.setVisible(true);
    }

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Click Count: "+ count);
    }
}
