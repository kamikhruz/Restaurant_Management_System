/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Group4_RestaurantsManagementSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.OPTION;

/**
 *
 * @author Kamie.K
 */

    
     // The code block to exit
    private JFrame frame;

public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant Management Systems",
                JOptionPane.YES_NO_OPTION)  == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }
    
   
    
    
    
    
    
    
    
}
    