package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
//TODO Learn GUIs enough to atually do something useful

public class Metadata implements ActionListener {

    // Declare variables early on
    private int count = 0;
    private JLabel selectSlotsLabel;
    private JButton startButton;
    private JFrame frame;
    private JPanel panel;

    public Metadata(){
        frame = new JFrame();

        // Setting up the actual UI
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);

        // Create UI elements
            //startButton
            startButton = new JButton("Start");
            startButton.addActionListener(this);
            panel.add(startButton);

            // selectSlotsLabel
            selectSlotsLabel = new JLabel("Click Count: "+"No Clicks Yet");
            panel.add(selectSlotsLabel);

        //
        // Paperwork-esk stuff
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PotionFiller Interface");
        frame.pack();
        frame.setSize(1200, 675); ;
        frame.setVisible(true);
    }

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static void main(String[] args){
        new Metadata();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        selectSlotsLabel.setText("Click Count: "+ count);
    }
}
