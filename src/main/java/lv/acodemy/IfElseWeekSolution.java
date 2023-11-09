package lv.acodemy;

public class IfElseWeekSolution {
    public static void main(String[] args) {
        /*
        Write a progress that accepts a number (0-6)
        as input and users if else statements to determine
        the corresponding day of the week ( 0 is Sunday, 1 is Monday ext)
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter day of the week (0-6)");
        String userInput = myScanner.next();

        switch (userInput) {
            case "0":
                System.out.println("Sunday");
                break;
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("user input is not correct:" + userInput);

        }

    }
}
