package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");
        // int (number)
        int myCurrentAge = 42;
        System.out.println(myCurrentAge);

        /*
        This is multi line comment approach
        TODO: Delete it later
         */

        byte myWeight = 60; // Byte data type
        short salary = 2000; // short data type
        char myFirstLetterofName = 'I'; // character data type
        long populationofLatvia = 1900000; // long data type
        double numberPi = Math.PI; //PI number
        float randomNumber = 313813.231313f; // float number
        // boolean true/false is,has
// example: isSummer,isAdult

        boolean isSummer = false;
        boolean isAutumn = true;
        var age = 20;
        var myCurrentWeight = 60.5;
        // exercise 1.
// Create 2 varibles for each data type
// Variable should be meanful as it possible
// Variable name should contain at least 2 words
// snake case: my_snake_case
// kebeb case: my-current-age
//lover camel case: loverCamelCase
// constants: int MY_AGE=10
//print all the variables values

        byte myFloor = 12;
        System.out.println(myFloor);

        byte myAge = 42;
        short distanceTillMoscow = 1000;
        short myActualDebtValue = 1000;
        char fisrtLetterOfmySurname = 'F';
        char nameOfMyStreet = 'V';
        long distanceTillMoon = 100000000;
        double numberPrice = 1.99;
        float numberRandom = 1234567.1234567f;

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;
        int summa = x + y + z;
        System.out.println(summa);

        int summaExample = 10 + z + 5 + y + z + 20;
        System.out.println(summaExample);

// 2a(a+b); result;
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
// 2*4(4+3);
        System.out.println(result);

// String (non-primitive)
        String firstName = "Inna";
        String lastName = "Fjodorova";
        System.out.println(firstName);
        System.out.println(lastName);
        String fullSentence = firstName + " " + lastName + " . ";

//Exercise 2
// Create  two-three String variables
// Combine
// Print result

        String todayDate = "onSunday";
        String myAction = "IshallGotoplayTennis";
        String actualTime = "intheEvening";
        String fullSentence2 = todayDate + " " + myAction + " " + actualTime + " ";
    }
}