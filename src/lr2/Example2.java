package lr2;

import java.util.Scanner;

//2 Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();

        int res1 = num % 5;
        int res2 = num % 7;

        System.out.println("Result 1: " + res1 +", Result 2: " + res2);
        if(res1 == 2)
        {
            if(res2 == 1)
            {
                System.out.println("Completed");
            }
            else
            {
                System.out.println("Not completed" );
            }
        }
        else
        {
            System.out.println("Not completed");
        }
        in.close();
    }
}
