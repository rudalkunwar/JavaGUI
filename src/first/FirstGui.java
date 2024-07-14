/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first;

/**
 *
 * @author ruzal
 */
import javax.swing.*;
public class FirstGui {
    
    public FirstGui(){
        JFrame f = new JFrame();
        f.setSize(350,450);
        f.setVisible(true);
        f.setLayout(null);
        
        JTextArea ta = new JTextArea("Hello");
        JButton btn = new JButton("submit");
        JCheckBox cb = new JCheckBox();
        JRadioButton rb = new JRadioButton();
        JComboBox cbox = new JComboBox();
        JTable tbl = new JTable();
        ta.setBounds(60, 20, 250, 150);
        ta.setEditable(false);
        btn.setBounds(60,180,250,20);
        f.add(ta);
        f.add(btn);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new FirstGui();
    }
    
}
