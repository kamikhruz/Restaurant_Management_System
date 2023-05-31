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
public class SuperClass_Parent {
 // The prices of the food and drinks
    public double  ChickenBurger;
    public double  ChickenBurgerM;
    public double  ChickenLegend;
    public double  Filet_O_Fish;
    public double  BaconCheeseBurger;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double ChocMilkShake;
    public double VanMilkShake;
    
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    
    public double AllTotalofMD;

    
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
    