package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 8, 10, 11};

        int myNumber = numbers[4];
        System.out.println(myNumber);

        // deterlmine size of array
        System.out.println(numbers.length);


        //change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));

        int[] emptyArray = new int[12];
        System.out.println(Arrays.toString(emptyArray));

        // update empty array with numbers
        emptyArray[0] = 10;
        emptyArray[1] = 10;
        emptyArray[3] = 7;
        emptyArray[8] = 9;
        System.out.println(Arrays.toString(emptyArray));

        //String[] array
        String[] fruitBasket = {"apples", "banana", "kiwi", "pear", "pineapple"};
//first fruit = apples--> [0] index
// second fruit = banana --> [1] index
        String fruit = fruitBasket[3];
        System.out.println(fruit);
        System.out.println(fruitBasket[3]);

        //Logic in Java
        /* condition = true/false
        /*
if(condition){
// execute this code block
         */


        if (10 > 5) {
            System.out.println("This statement is true!");
        }

        if (10 < 5) {
            System.out.println("This statement is also true");
        }

        if (fruitBasket[0].equals("apples")) {
            System.out.println("Yes, you find apples");
        }


        // if-else (is,has)
        boolean isSummer = false;

        if (isSummer) {
            System.out.println("We will be on the beach");
        } else {
            System.out.println("We will watching TV");
        }

        /*
        if-else-if-else

        if(condition){
        if condition true-execute

        } else if (condition){
        if condition true-execute

        } else if(condition){
        if condition true-execute

        } else {
        if no match-execute
        }
         */

        //  String light ="red"; // contains color of traffic light

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();

        if (light.equals("Green")) {
            System.out.println("You can go!");

        } else if (light.equals("yellow")) {
            System.out.println("Do not go, pls wait for green light");

        } else if (light.equals("red")) {
            System.out.println("Do not go!");

        } else {
            System.out.println("Traffic light is not working!");
        }
    }
}




