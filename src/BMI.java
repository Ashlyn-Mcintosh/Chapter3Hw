/**
 * @class: BMI
 * @date: February 9, 2023
 * @version: 3.0
 * description: This program will calculate the user's BMI based on the weight and height given.
 */


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches:"); //The user puts their height
        double height = input.nextDouble();

        System.out.println("Enter your weight in pounds: "); //The user puts their weight
        double weight = input.nextDouble();

        double kilograms = weight * 0.4536;
        double meters = height * 0.0254;

        double BMI = kilograms / (meters * meters);
        System.out.print("Body Mass Index is " + BMI);




    }

}
