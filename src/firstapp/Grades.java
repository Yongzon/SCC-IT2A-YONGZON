package firstapp;

import java.util.Scanner;

public class Grades {
    
    public void getGrade(){
         Scanner input = new Scanner(System.in);
        
        String name;
        int m, s, e, c, tm;
        float totalAve;
        
        System.out.print("Enter your full name: ");
        name = input.nextLine();
        
        System.out.println("Enter Marks in: ");
        System.out.print("Math: ");
        m = input.nextInt();
        System.out.print("Science: ");
        s = input.nextInt();
        System.out.print("English: ");
        e = input.nextInt();
        System.out.print("Computer: ");
        c = input.nextInt();
        
        System.out.println("----------------------------------");
        System.out.println("Grade Detail");
        System.out.println("----------------------------------");
        
        tm = m + s + e + c;
        totalAve = tm/4;
               
        System.out.println("Name: "+name);
        System.out.println("Total Marks: "+tm);
        System.out.println("Total Average: "+totalAve);
        
        if(totalAve >= 75){
            System.out.println("You pass!");
        }else{
            System.out.println("You failed!");
        }
    }
}
