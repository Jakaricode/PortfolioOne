/* 
Programmer: Nathan Moore
Section: Monday @ 6
Date: 9/15/2018
Purpose: Create a Java application.
*/
import javax.swing.*;
public class Project2
{
   public static void main(String[] args) 
   {
      float bedRoom = 20.0f;
      float diningRoom = 40.0f;
      float hAll = 5.0f;
      float greatRoom = 60.0f;
      float sTaris = 30.0f;
      float bedroomFact = 0.15f;
      float diningFact = 0.1f;
      float hallFact = 0.2f;
      float greatroomFact = 0.25f;
      float starisFact = 0.30f;
      System.out.println("The carpet measurements are:\n");
      System.out.print("bed room:\t");
      System.out.print(bedRoom);
      System.out.println(" square feet");
      System.out.print("dining room:\t");
      System.out.print(diningRoom);
      System.out.println(" square feet");
      System.out.print("hall:\t");
      System.out.print(hAll);
      System.out.println(" square feet");
      System.out.print("great room:\t");
      System.out.print(greatRoom);
      System.out.println(" square feet");
      System.out.print("stairs:\t");
      System.out.print(sTaris);
      System.out.println(" square feet\n");
      System.out.print("standard carpet cost:\t$");
      System.out.println((bedRoom+diningRoom+hAll+greatRoom+sTaris)/hAll*bedRoom);
      System.out.print("weighted carpet cost:\t$");
      System.out.print((bedRoom*bedroomFact+diningRoom*diningFact+hAll*hallFact+greatRoom*greatroomFact+sTaris*starisFact)*bedRoom);
      float StnrdAv = 620.0f;
      float WghtAv = 640.0f;
      JOptionPane.showMessageDialog(null,"Standard carpet cost $"+(StnrdAv)+"\nWeighted carpet cost $"+(WghtAv), "Final Cost",
      JOptionPane.INFORMATION_MESSAGE);
      
      
      
      
      
      
   }
}    