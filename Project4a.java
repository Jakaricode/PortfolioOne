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


public class Project4a
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
      String num;
      String input;
      String bevname;
      String foodname;
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
                  foodname = "bagel";
                  foodcost = bagel;
                  }
               else if (choice == 2)
                  {
                  foodname = "donut";
                  foodcost = donut;
                  }
               else if (choice == 3)
                  {
                  foodname = "croissant";
                  foodcost = croissant;
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
                  bevname = "latte";
                  bevcost = latte;
                  }
               else if (choice == 2)
                  {
                  bevname = "coffee";
                  bevcost = coffee;
                  }
               else if (choice == 3)
                  {
                  bevname = "milk";
                  bevcost = milk;
                  }
               else if (choice == 4)
                  {
                  bevname = "tea";
                  bevcost = tea;
                  }
                 System.out.println("How many do of these items do you want");
                 
                 choice = scan.nextInt();
                 totcost = (foodcost + bevcost)*choice;
                 
                 JOptionPane.showMessageDialog(null,"Breakfast ordered: " +foodcost+ "\nBeverage ordered: " +bevcost+ "\nNumber ordered: " +choice+ "\nTotalcost: $"+totcost,"YOUR BILL",JOptionPane.INFORMATION_MESSAGE);
                 }
            }
            }

     
  
             
          
 
    
     
   
   
      
      
   
   
   
   
