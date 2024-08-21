package firstapp;

public class FirstApp {
    public static void main(String[] args) {
       
        //Grades grd = new Grades();
       // grd.getGrade();
     
        System.out.printf("%-10d %-10s %-10d %-10d %-10s %-10d\n", "Product ID", "Name", "Price", "Stocks", "Status", "Tep");
        
       Product pr = new Product();
       pr.addProducts(10011, "soap", 20, 10);
       pr.viewProduct();
       
       Product pr1 = new Product();
       pr1.addProducts(1002, "cards", 50, 0);
       pr.viewProduct();
    }
    
}
