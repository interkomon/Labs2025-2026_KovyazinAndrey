package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input day of week: ");
    String day = in.nextLine();
        if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday")
                && !day.equals("Thursday") && !day.equals("Friday")
                && !day.equals("Saturday") && !day.equals("Sunday")) {
        System.out.println("Error: Day of week \n" +
                "Monday \n" +
                "Tuesday \n" +
                "Wednesday \n" +
                "Thursday\n" +
                "Friday \n" +
                "Saturday\n" +
                "Sunday");
    }
    switch (day) {
        case "Monday":
            System.out.println("1");
            break;
        case "Tuesday":
            System.out.println("2");
            break;
        case "Wednesday":
            System.out.println("3");
            break;
        case "Thursday":
            System.out.println("4");
            break;
        case "Friday":
            System.out.println("5");
            break;
        case "Saturday":
            System.out.println("6");
            break;
        case "Sunday":
            System.out.println("7");
            break;
        default:
            break;

    }

    in.close();
}
}