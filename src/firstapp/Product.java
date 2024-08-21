package firstapp;
import java.util.Scanner;
public class Product {
   String name, status;
   int pid, stks, price, tep;
   
   public void addProduct(String nm, String st, int pd, int pr, int stk, int tp){
       this.name = nm;
       this.pid = pd;
       this.price = pr;
       this.stks = stk;
       this.tep = tp; 
       this.status = st;
   }
   
   public void viewProduct(){
       double totalExpectedprofit = this.price * this.stks;
       String Status = (this.stks < 0) ? "Available" : "Out of Stock";
       
       
       System.out.printf("%-10d %-10s %-10d %-10d %-10s %-10d\n", this.pid, this.name, this.price, this.stks, Status, totalExpectedprofit);
   }
}
