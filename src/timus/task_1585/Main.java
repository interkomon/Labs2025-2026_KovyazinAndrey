package timus.task_1585;

import java.util.Scanner;

//Программист Денис c детства мечтал побывать в Антарктиде, но почему-то регулярных рейсов туда нет.
//Поэтому Денис все лето изучал Антарктиду с помощью соседнего кинотеатра.
//Теперь он знает, что в Антарктиде водится несколько видов пингвинов:
//Императорские пингвины (Emperor Penguins) — любители петь;
//Малые пингвины (Little Penguins) — любители потанцевать;
//Пингвины Макарони (Macaroni Penguins) — любители сёрфинга.
//К сожалению, в мультфильмах не было сказано, какой вид пингвинов самый многочисленный.
//Денис решил выяснить это: он посмотрел эти мультфильмы еще раз, и каждый раз, когда видел пингвина, записывал в блокнот название его вида.
//Сейчас Денис дал вам блокнот с просьбой выяснить, какой вид пингвинов самый многочисленный.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number notes: ");
        int n = in.nextInt();
        in.nextLine();
        int emppeng = 0;
        int litpeng = 0;
        int macpeng = 0;

        System.out.println("Input penguin species "+n +" times: Emperor Penguin/Little Penguin/Macaroni Penguin");
        for (int i = 0; i < n; i++)
        {
            String peng = in.nextLine();
            if(peng.equals("Emperor Penguin"))
            {
                emppeng++;
            }
            else if (peng.equals("Little Penguin"))
            {
                litpeng++;
            }
            else if(peng.equals("Macaroni Penguin"))
            {
                macpeng++;
            }
        }
        String res = "";
        if(emppeng > litpeng && emppeng > macpeng)
        {
            res = "Emperor Penguin";
        }
        else if(litpeng > emppeng && litpeng > macpeng)
        {
            res = "Little Penguin";
        }
        else if(macpeng > emppeng && macpeng > litpeng)
        {
            res = "Macaroni Penguin";
        }

        System.out.println("Popular: "+res);
        in.close();

    }
}
