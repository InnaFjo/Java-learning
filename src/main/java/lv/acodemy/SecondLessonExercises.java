package lv.acodemy;

public class SecondLessonExercises {
    public static void main(String[] args) {

        //exercise 1
        // even or odd Number Checker
        // Write a progress that takes or integer input
        // From the user and checks if it is even or odd using an if statement

        int number = 11;
        if (number % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }


        //exercise 2
        //Largest of Three Numbers
        //Create a program that takes three numbers as input
        //and determines which one is the largest using if-else-if statements

        int x = 10;
        int y = 12;
        int z = 14;

        if (x > y && x > z) {
            System.out.println("x this is the largest number!");
        } else if (y > x && y > z) {
            System.out.println("y this is the largest number");
        } else if (z > x && z > y) {
            System.out.println("z this is the largest number!");
        } else {
            System.out.println("Whey all are equals or o!");
        }

        System.out.println(Math.max(10, Math.max(12, 14)));


        // exercide 4
        // Positive,Negative or zero Checker
        // Create a program that reads a number from the user and determines
        //if it is positive,negative or Zero using or in statement.


        int num = 10;
        if (num == 0) {
            System.out.println("Number is ZERO");
        } else if (num < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("Positive number");
        }


        // BMI (Body Mass Index) Calculator: Take a person's weight and height as input and use an if statement to calculate and display their BMI category
//        (e.g., underweight, normal weight, overweight, or obese).
//        (BMI = weight (kg) / (height (m) * height (m)))

        double weight = 65.0;
        double height = 1.74;

        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
            System.out.println("Minimal health risk");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
            System.out.println("Minimal health risk");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
            System.out.println("Increased health risk");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obese");
            System.out.println("High health risk");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Severely Obese");
            System.out.println("Very high health risk");
        } else {
            System.out.println("Morbidly Obese");
            System.out.println("Extremely high health risk");
        }
    }
}


// Exercise 3
// 3.	Age Category Determiner: Prompt the user to enter their age,
// and then use an if statement to categorize them as a child,
// teenager, adult, or senior citizen.

