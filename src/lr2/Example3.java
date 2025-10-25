package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();
        int res = num % 4;

        System.out.println("Result divided into 4: " + res);

        if(res == 0)
        {
            if(num > 10)
            {
                System.out.println("Completed");
            }
            else
            {
                System.out.println("Not completed");
            }
        }
        else
        {
            System.out.println("Not completed");
        }
       in.close();

    }
}
