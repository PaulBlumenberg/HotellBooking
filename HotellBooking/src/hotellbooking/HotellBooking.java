
package hotellbooking;

import java.util.Scanner;

public class HotellBooking {
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
    HotellBooking hb =new HotellBooking();
    hb.menu1();
    }    
        public void menu1() {
            String passKey = "1234";
            
            System.out.println("---Welcome to hotell booking---");
            System.out.println("1. Customer Booking");
            System.out.println("2. Administrator");
            System.out.println("0. Exit program");


                switch (input.nextInt()) {
                    case 1:
                        
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("Put in password");
                        String n = input.nextLine();
                   
                        if (n.equals(passKey)) {
                            
                            HotellBooking hb =new HotellBooking();
                            hb.adminMenu();
                            
                        } else {
                            menu1();                               
                        }
                        
                        
                        break;
                    case 0:
                        System.out.println("System shutting down....");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error try again");
                }
    
        }
        public void adminMenu(){
            
           
            
            System.out.println("1. Storing Customer Details ");
            System.out.println("2. Searching Customer Details ");
            System.out.println("3. Upgrade and delete details ");
            System.out.println("4. Booking or upgrading room ");
            System.out.println("5. Ordering Food for Particular Room ");
            System.out.println("6. Check out for customer and showing bill ");
            
                switch (input.nextInt()) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;              
                    case 3:
                        
                        break;              
                    case 4:
                        
                        break;              
                    case 5:
                        
                        break;              
                    case 6:
                        
                        break;              
                    default:
                        System.out.println("Error try again");
                }
            
        }
        
}
