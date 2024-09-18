package firstapp;
import java.util.Scanner;
public class Product {
    
    Scanner sc = new Scanner(System.in);
        Products[] pr = new Products[100];
        
        int nump, i;
        int ttp = 0;
        
public void manageProducts(){
        System.out.print("Enter no. of Products: ");
        nump = sc.nextInt();
    
        for (i = 0; i< nump; i++){
            System.out.println("Enter details of Product "+(i + 1)+": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String nm = sc.next();
            System.out.print("Price: ");
            double pri = sc.nextDouble();
            System.out.print("Stock: ");
            int stk = sc.nextInt();
            System.out.print("Sold: ");
            int sld = sc.nextInt();
            pr[i]= new Products();
            pr[i].addProducts(id, nm, pri, stk, sld);
            ttp = (int) (ttp + (pri * sld));
        }
        
        for ( i = 0; i < nump; i++){
            pr[i].viewProducts();
        } 
            System.out.println("\nTotal Profit: "+ttp);
            System.out.println("Total TEP: "+ttp);  
    }    
}
