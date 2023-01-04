/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notepadapp;

import java.awt.Font;
import javax.swing.*;

public class About extends JFrame {

    About() {
        setBounds(100, 100, 500, 400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("icons8-windows-notepad-64.png"));
        setIconImage(icon.getImage());
        setLayout(null);
        
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("icons8-windows-notepad-64.png")));
        iconLabel.setBounds(100,50,80,80);
        add(iconLabel);
        
        JLabel textLabel = new JLabel("<html>Welcome to Notepad<br>Notepad is simple text editor for Microsoft Windows and a basic tsxt-editing programe which enables computer users to create documents<br>All rights reserved@2021</html>");
        textLabel.setBounds(100,50,350,300);
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
        add(textLabel);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
