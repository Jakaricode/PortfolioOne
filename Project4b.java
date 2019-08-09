/*
Nathan Moore
9.24.2018
Homework 4
Cis 1500 6pm
*/

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;


public class Project4b
   {
      

   public static void main(String[]args)
   {
      
      double bagel = 2.00;
      double donut = 1.50;
      double croissant = 3.00;
      double coffee = 1.25;
      double milk = 1.00;
      double tea = 0.50;
      double latte = 1.50; 
      double bevcost = 0.00;
      double foodcost = 0.00;
      int choice = 0;
      int inFlav = 0;
      String num;
      String foodname = "";
      String bevname = "";
      String input;
      String flavorString = "";
      double numord = 0.0;
      Scanner scan = new Scanner (System.in);
      
    
              NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
               input = JOptionPane.showInputDialog("WELCOME TO BeBe Breakfast"+
               "\n CHOOSE a Breakfast item:"+
               "\n 1 bagel @ 2.00"+
               "\n 2 donut @ 1.50"+
               "\n 3 croissant @ 3.00");
               
                choice = Integer.parseInt(input);
            
                 
               if (choice == 1)
                  {
                  foodname = "Bagel";
                  foodcost = bagel;
                  }
               else if (choice == 2)
                  {
                  foodname = "Donut";
                  foodcost = donut;
                  }
               else if (choice == 3)
                  {
                  foodname = "Croissant";
                  foodcost = croissant;
                  }
              
              inFlav = Integer.parseInt(input);
                
                if (choice == 1)
                 {
                 input = JOptionPane.showInputDialog("choose a flavor for your bagel"+
                 "\n 1 Onion"+
                 "\n 2 Blueberry"+
                 "\n 3 Rye");
                                
                                      inFlav = Integer.parseInt(input);
       
                                 switch (inFlav)
                                   
                               {
                                    case 1: flavorString = "Onion";
                                    break;
                                   
                                    
                                    case 2: flavorString = "Blueberry";
                                    break;
                                    
                                   
                                    case 3: flavorString = "Rye";
                                    break;
                                    
                                    
                                    case 4: flavorString = "Plain";
                                    break;
                                   }
                                 
                                 
                 }
                  
             
                else if (choice == 2)
                 {
                input = JOptionPane.showInputDialog("choose a flavor for your donut"+
                 "\n 1 Jelly"+
                 "\n 2 Chocolate"+
                 "\n 3 Sprinkles"+
                 "\n 4 Cinnamon");
                              
                           inFlav = Integer.parseInt(input);
   
                              
                              switch (inFlav)
                                   
                               {
                                    case 1: flavorString = "Jelly";
                                   break;
                                    
                                    case 2: flavorString = "Chocolate";
                                    break;
                                    
                                   
                                    case 3: flavorString = "Sprinkles";
                                    break;
                                    
                                    
                                    case 4: flavorString = "Cinnamon";
                                    break;
                                   }

                 }             
                {
                  double totcost;
               
               input = JOptionPane.showInputDialog("Choose one of the following Beverages"+
               "\n Enter:"+
               "\n 1 Latte @ 1.50"+
               "\n 2 Coffee @ 1.25"+
               "\n 3 Milk @ 1.00"+
               "\n 4 Tea @ 0.50");
               
               
               choice = Integer.parseInt(input);
               
               if (choice == 1)
                  {
                  bevname = "Latte";
                  bevcost = latte;
                  }
               else if (choice == 2)
                  {
                  bevname = "Coffee";
                  bevcost = coffee;
                  }
               else if (choice == 3)
                  {
                  bevname = "Milk";
                  bevcost = milk;
                  }
               else if (choice == 4)
                  {
                  bevname = "Tea";
                  bevcost = tea;
                  }
                 System.out.println("How many do of these items do you want");
                 
                 choice = scan.nextInt();
                 totcost = (foodcost + bevcost)*choice;
                 
                 
                
                 
                 JOptionPane.showMessageDialog(null,"Breakfast ordered: \n"+foodname+" "+flavorString+" @ $"+foodcost+ "\nBeverage ordered: \n"+bevname+" @ $" +bevcost+ "\nNumber ordered: \n\t" +choice+ "\nTotalcost: \n\t$"+totcost,"YOUR BILL",JOptionPane.INFORMATION_MESSAGE);
                 }
            }
            }

     
  
             
          
 
    
     
   
   
      
      
   
   
   
   
