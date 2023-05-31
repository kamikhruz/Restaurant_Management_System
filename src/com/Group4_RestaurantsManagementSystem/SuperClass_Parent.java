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
    
    //The prices of the food and drinks
        
    public double  pChickenBurger = 3.56;
    public double  pChickenBurgerM = 2.95;
    public double  pChickenLegend = 3.98;
    public double  pFilet_O_Fish = 2.65;
    public double  pBaconCheeseBurger = 3.64;
    
    public double pMilkShake = 2.10;
    public double pVanillaCone = 2.20;
    public double pClasVanilla = 2.50;
    public double pChocMilkShake = 1.95;
    public double pVanMilkShake = 2.37;
    //=================================================
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
// This is the Tax Function
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    
    //

    // A function to get the amount of the food and drinks
    public double GetAmount()
    {
        Meals = Filet_O_Fish + ChickenLegend + ChickenBurger + ChickenBurgerM + BaconCheeseBurger;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
       
        return AllTotalofMD;    
    }
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
    
  
    