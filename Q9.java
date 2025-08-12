import java.util.*;
public class Main {
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);


        System.out.print("Enter the dividend (first integer): ");
        int dividend = sc.nextInt(); 

        System.out.print("Enter the divisor (second integer): ");
        int divisor = sc.nextInt(); 
        

        int quotient = dividend/ divisor;                  
        int remainder = dividend % divisor;
   System.out.println("Quotient: "+quotient);
   System.out.println("Remainder:"+remainder);
        }
        
    }
