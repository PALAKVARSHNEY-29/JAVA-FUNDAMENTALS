import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the dividend (first integer): ");
        int dividend = input.nextInt(); 

        System.out.print("Enter the divisor (second integer): ");
        int divisor = input.nextInt(); 
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            
            int quotient = dividend / divisor;                  int remainder = dividend % divisor;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
        input.close();
    }
}