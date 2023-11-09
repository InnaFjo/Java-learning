package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        //Loop!
        // for loop
        /*
        for(counter; condition; counter change) {
*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        // print number from i till 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // print numbers from 10 till 0

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayofNames = {"Inna", "Sofija", "Tatjana", "Natalija"};

        //arrayofNames[0]---> sout
        //arrayofNames[1]

        for (int i = 0; i < arrayofNames.length; i++) {
            System.out.println(arrayofNames[i]);

            //arrayofNames[0]
            //arrayofNames[1]
            //arrayofNames[2]
            //arrayofNames[3]
            //arrayofNames[4]
            //arrayofNames[5]
            //arrayofNames[6]  do not go
        }

        // for each

        for (String name : arrayofNames) {
            System.out.println(name);
        }

        String[] countries = {"United States", "Canada", "United Kingdom", "Germany", "France", "Australia", "Japan", "India", "China", "Brazil"};

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("kuku");
                break;
            }
            System.out.println(countries[i]);
        }

        // 3 number array

        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {3, 4, 5, 6, 7};
        int[] thirdArray = {5, 6, 7, 8, 9};

        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfFirstArray);
                    }
                }

            }
        }

        // from 0 till 100
        // print even numbers

        //for ---> iterate from 0 to 100
        // if---> if this is even number, we print ir

        int number = 51;
        boolean isEven = 50 % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // while---> do while
        /*
        while (condition){
            // execute code block;
        }
         */

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Calculate the sum of numbers from 1 to 5 using while loop

        int x = 1;
        int summa = 0;
        while (x <= 5) {
            summa = summa + x;
            x++;
        }
        System.out.println("Summa:" + summa);

        // 1+2+3+4+5=15;


        //print even numbers from 0 to 20

        int y = 0;
        while (y <= 20) {
            System.out.println(y + " ");
            y = y + 2;
        }

        // do {
        // execute code block
        // { while( condition);

        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);
    }

}



