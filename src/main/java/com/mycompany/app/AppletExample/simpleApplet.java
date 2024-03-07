package com.mycompany.app.AppletExample;
import javax.swing.*;
import javax.swing.JApplet;
import java.awt.*;

@SuppressWarnings("removal")
public class simpleApplet extends JApplet{
    public void init(){
        Container cp = getContentPane();
        cp.add(new JLabel("Simple JApplet");
    }
    
}
