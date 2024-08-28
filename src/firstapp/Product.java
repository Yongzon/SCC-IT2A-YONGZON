package firstapp;

public class Product {
   String name;
   int pid, stks, sold;
   double price;
   
   public void addProduct(int pd, String nm,  double pr, int stk, int sd) {
    this.pid = pd;
    this.name = nm;
    this.price = pr;
    this.stks = stk;
    this.sold = sd;
}
   
   public void viewProduct(){
       double profit = this.price * this.sold;
       double tep = this.stks * this.price;
       String Status = (this.stks > 0) ? "Available" : "Out of Stock";
       
       
       System.out.printf("%-10d %-10s %-10.2f %-10d %-10.2f %-10s\n", this.pid, this.name, this.price, this.stks, this.sold, profit, Status);
   }
}
