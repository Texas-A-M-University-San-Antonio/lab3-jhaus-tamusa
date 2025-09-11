/**
 * Name: [John Hauser]
 * Date: [9/10/25]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

import java.util.Scanner; // Don't forget to import and declare a Scanner for user input.

public class InClass3_John_Hauser
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        double side; // declaring 
        double volume;
        double surfaceArea; 


        // Step 2: Read the user's input and store it in a variable.
        System.out.println("Please enter the side length of the cube: "); // prompting user to input length
        side = input.nextDouble();

        System.out.println("Please enter the volume of the cube: "); // prompting user to input volume size
        volume = input.nextDouble();

        System.out.println("Please enter the surface area of the cube: "); // prompting user to input surface area
        surfaceArea = input.nextDouble();


        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);


        // Step 4: Use an appropriate method to determine the surface area of the cube.
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        surfaceArea = Math.pow(side, 2);


        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume is " + volume);
        System.out.println("The surface area is " + surfaceArea);
    }
}