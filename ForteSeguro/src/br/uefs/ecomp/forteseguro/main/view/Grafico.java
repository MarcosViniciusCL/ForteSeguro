/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.forteseguro.main.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


/**
 *
 * @author User
 */
public class Grafico extends JPanel {

    public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.fillOval(20, 50, 100, 100);
    }   
    
}
