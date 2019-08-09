/* 
Nathan Moore
CIS 1500
Project 3
10/1/18
*/ 

import java.util.Scanner;
public class Project3 
   {
      public static void main (String[]args)
       {
     
  
  
  int numLoaves; 
  int quartMilk;
  double poundCheese;
  double breadCost = 1.50;
  double milkCost = 1.00;
  double cheeseCost = 0.50;
  String input;
  double billtot;
  Scanner dairy = new Scanner (input);
        
       
        quartMilk = Integer.parseInt(input);
        poundCheese = Integer.parseInt(input);
        
  double totmilkcost; 
  double totbreadcost;
  double totcheesecost; 
   numLoaves = Integer.parseInt(input);
  totmilkcost = (milkCost * quartMilk);
  totbreadcost = (breadCost * numLoaves);
  totcheesecost = (cheeseCost * poundCheese);
  
  billtot = (totmilkcost + totbreadcost + totcheesecost);
  
 String numApples;
 double appcost = .20;
 
 System.out.println("Enter the number of loaves of bread");
 numLoaves = dairy.nextInt();
 }
 }
  
  
   