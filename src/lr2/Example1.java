package lr2;

import java.util.Scanner;

//1 Напишите программу, которая проверяет, делится ли введенное
//Пользователем число на 3


public class Example1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.println("Input number divided 3: ");
        int num = in.nextInt();

        int res = num % 3;
        System.out.println("Result: "+res  );
        if(res == 0)
        {
            System.out.println("Divided into 3");
        }
        else
        {
            System.out.println("No divided");
        }
    in.close();
    }
}
