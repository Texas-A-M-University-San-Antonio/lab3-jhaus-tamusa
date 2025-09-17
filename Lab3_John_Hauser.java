/**
 * Name: [John Hauser]
 * Date: [9/10/25]
* Purpose: Lab3 - 
* [calculating compound interest]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class Lab3_John_Hauser
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // Scanner declared
        
        //Variables declared
        double initialValue; // initial vale of home
        int years; // number of years elapsed
        double interestRate; //yearly interest interes rate
        double finalValue; // final value of home after compound interest

        //Information prompts for the user
        System.out.println("Please enter the initial value of the home: ");
        initialValue = input.nextDouble();

        System.out.println("Please enter the number of years that have elapsed: ");
        years = input.nextInt();

        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();

        // Converting interest rate to a decimal from a percentage
        interestRate = interestRate / 100;

        //Value calculation
        finalValue = initialValue * Math.pow(1 + interestRate, years);

        //Final result
        System.out.printf("The total value of the home with compound interest is: %.2f\n", finalValue);










        
    }
}