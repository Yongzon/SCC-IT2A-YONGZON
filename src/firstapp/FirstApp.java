package firstapp;
import java.util.Scanner;
public class FirstApp {
    public static void main(String[] args) {
       
        //Grades grd = new Grades();
       // grd.getGrade();
    
        //Product pr = new Product();
       //pr.addProduct(1011, 10, "Soap", 20);
       // pr.viewProduct();

        //Product pr1 = new Product();
        //pr1.addProduct(1012, 50, "Cards", 0);
        //pr1.viewProduct();
        
        Scanner sc = new Scanner(System.in);
        Product[] pr = new Product[100];
        
        int nump, i;
        
        System.out.print("Enter no. of Products: ");
        nump = sc.nextInt();
        double ttp = 0;
        
        for ( i = 0; i< nump; i++){
            System.out.println("Enter details of Product "+(i + 1)+": ");
            System.out.print("ID: ");
            int pid = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stock: ");
            int stks = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            pr[i]= new Product();
            pr[i].addProduct(pid, name, price, stks, sold);
        }
        
        for ( i = 0; i < nump; i++){
            pr[i].viewProduct();
            ttp = ttp +(pr[i].price * pr[i].sold);
        }
            System.out.print("Total Profit: "+ttp);
    } 
}
