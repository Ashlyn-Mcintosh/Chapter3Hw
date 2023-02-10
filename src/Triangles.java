/**
 * @class: Triangles
 * @date: February 9, 2023
 * @version: 5.0
 * description: This program will calculate the perimeter of a triangle based on what the user inputs for the edges.
 * If not valid, it prints invalid
 */


import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first edge for your triangle:"); //The user puts a number for the first edge/side
        System.out.print(" A: ");
        double A = input.nextDouble();
        System.out.println("Enter the 2nd edge for your triangle:"); //The user puts a number for the 2nd edge/side
        System.out.print(" B: ");
        double B = input.nextDouble();
        System.out.println("Enter the 3rd edge for your triangle:"); //The user puts a number for the 3rd edge/side
        System.out.print(" C: ");
        double C = input.nextDouble();

        if(A + B > C && B + C > A && A + C > B){ //Calculates the sum of the edges

            double perimeter = A + B + C; //Assigning perimeter

            System.out.println("The perimeter of your triangle is: "+perimeter); //Prints out valid number

        }

        else{

            System.out.println("Invalid!"); //Prints out invalid number

        }

    }

}
