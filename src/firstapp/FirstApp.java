package firstapp;
import java.util.Scanner;
public class FirstApp {
    public static void main(String[] args) {
       
        /*Grades grd = new Grades();
        grd.getGrade();
    
        Product pr = new Product();
        pr.addProduct(1011, 10, "Soap", 20);
        pr.viewProduct();

        Product pr1 = new Product();
        pr1.addProduct(1012, 50, "Cards", 0);
         pr1.viewProduct(); */
        
        /*Scanner sc = new Scanner(System.in);
        Product[] pr = new Product[100];
        
        int nump, i;
        
        System.out.print("Enter no. of Products: ");
        nump = sc.nextInt();
        int ttp = 0;
       
        
        for ( i = 0; i< nump; i++){
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
            pr[i]= new Product();
            pr[i].addProduct(id, nm, pri, stk, sld);
            ttp = (int) (ttp + (pri * sld));
        }
        
        for ( i = 0; i < nump; i++){
            pr[i].viewProduct();
        }
            System.out.println("\nTotal Profit: "+ttp);
            System.out.println("Total TEP: "+ttp); */
        
        Accounts[] ac = new Accounts[100];
        Scanner in = new Scanner(System.in);
       
        int no, i;

        System.out.print("Enter number of Accounts: ");
        no = in.nextInt();

        for (i = 0; i < no; i++) {
            ac[i] = new Accounts();
         
            boolean identi;
            boolean email1;
            boolean username;
           
            System.out.println("Enter account Details " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                int id = in.nextInt();
                identi = false;

               
                for (int x = 0; x < i; x++) {
                    if (ac[x] != null && ac[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println("ID already exists. Try another one");
                } else {
                   
                    ac[i].id = id;
                    break;
                }
            }
           
            System.out.print("First Name: ");
            String fname = in.next();
            System.out.print("Last Name: ");
            String lname = in.next();
           
             while (true) {
                System.out.print("Email: ");
                String email = in.next();
                email1 = false;

               
                for (int x = 0; x < i; x++) {
                    if (ac[x] != null && ac[x].email.equals(email)) {
                        email1 = true;
                        break;
                    }
                }

                if (email1) {
                    System.out.println("Email already exists. Try another one");
                } else {
                   
                    ac[i].email = email;
                    break;
                }
            }
           
             while (true) {
                System.out.print("Username: ");
                String user = in.next();
                username = false;

               
                for (int x = 0; x < i; x++) {
                    if (ac[x] != null && ac[x].username.equals(user)) {
                        username = true;
                        break;
                    }
                }

                if (username) {
                    System.out.println("Username already exists. Try another one");
                } else {
                   
                    ac[i].username = user;
                    break;
                }
            }
           
            boolean passValid = false;
           
            while (!passValid) {
                System.out.print("Password: ");
                String password = in.next();

                if (ac[i].isValidPassword(password)) {
                    ac[i].addAccount(ac[i].id, fname, lname, ac[i].email, ac[i].username, password);
                    passValid = true;  
                } else {
                    System.out.println("Invalid password, Try Again! ");
                }
            }
            System.out.println("");
       

        }
        System.out.println("Account Details: ");
         System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n","ID", "FirstName", "LastName", "Email", "Username", "Password");
         System.out.println("---------------------------------------------------------------------------------");
        for (i = 0; i < no; i++) {
            if(ac[i] != null){
            ac[i].viewAccount();
            System.out.println("");
        }
        }
        
    }
 }  
