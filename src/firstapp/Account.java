package firstapp;
import java.util.Scanner;
public class Account {
    
        Accounts[] ac = new Accounts[100];
        Scanner in = new Scanner(System.in);
       
        int no, i;
        
public void manageAccounts(){
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
