/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CWrk3;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author mac
 */
public class keylan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        for (int d = 0; d<4; d++){
          System.out.println("Enter name: ");
          
               CWrk3 Std = new CWrk3();
            Std.SetName(new java.util.Scanner(System.in).nextLine());
               CWrk3 Stds= new CWrk3(98);
               
          System.out.println("Enter Registration Number: ");
          
               CWrk3 Std1= new CWrk3();
            Std.SetRegNo(new java.util.Scanner(System.in).nextLine());
                       
          
         System.out.println("Enter YOB: "); 
               CWrk3 Std2 = new CWrk3();
            Std.SetYob(new java.util.Scanner(System.in).nextInt());
            
            
            Scanner Smarks = new Scanner(System.in);
            
            
            String courses[] = {"BIT","CIT","ARCHITECTURE","MBA","BHE","DCS"};
           ArrayList<Integer> allMarks = new ArrayList<Integer>();
           
           int studentsmarks;
           for (int m=0; m<6; m++){
                System.out.print(courses[m] + ":");
               System.out.print("Enter Students Details: ");
               studentsmarks = Smarks.nextInt();
               Stds.SetMarks(studentsmarks);
               allMarks.add(m,studentsmarks);
              
           }
           int total = 0;
           for (int L = 0; L < allMarks.size(); L++){
               total += allMarks.get(L);
               
               int average = total / 6;
               System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + average);
               
           }
             allMarks.clear();
               
    }
    
    }

   
    
}