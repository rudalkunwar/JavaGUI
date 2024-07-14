/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first;

import javax.swing.*;

public class FirstGui {

    public FirstGui() {
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setVisible(true);
        f.setLayout(null);

        JTextArea ta = new JTextArea("Hello");
        ta.setBounds(60, 20, 250, 150);

        JLabel lbl = new JLabel("Choose the course");
        lbl.setBounds(60, 180, 250, 20);

        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(60, 200, 100, 20);

        JCheckBox cb2 = new JCheckBox("JavaScript");
        cb2.setBounds(180, 200, 100, 20);

        JRadioButton rb1 = new JRadioButton("Male", true);
        rb1.setBounds(60, 230, 100, 20);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(180, 230, 100, 20);

        JButton btn = new JButton("Submit");
        btn.setBounds(60, 270, 220, 30);

        // Use ButtonGroup to group the radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        // Add components to the frame
        f.add(ta);
        f.add(lbl);
        f.add(cb1);
        f.add(cb2);
        f.add(rb1);
        f.add(rb2);
        f.add(btn);

        // Set default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FirstGui();
    }
}
