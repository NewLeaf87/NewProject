package main;

import java.awt.Color;

import javax.swing.JFrame;

public class UI {
    GameManager gm;

    JFrame window;

    public UI(GameManager gm) {

        this.gm = gm;

        creatMainField();

        window.setVisible(true);
        
    }

    public void creatMainField() {

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
    }


    
}
