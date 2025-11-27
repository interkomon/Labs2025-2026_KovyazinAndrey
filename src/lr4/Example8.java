package lr4;

import java.util.Scanner;

public class Example8 {
        public static String getEncryptString(String encryptString, int shift) {
            char[] arrayChar = encryptString.toCharArray();
            long[] arrayInt = new long[arrayChar.length];
            char[] arrayCharNew = new char[arrayChar.length];

            for (int i = 0; i < arrayChar.length; i++) {
                arrayInt[i] = arrayChar[i] + shift;
                arrayCharNew[i] = (char) arrayInt[i];
            }

            encryptString = new String(arrayCharNew);
            return encryptString;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("введите текст для шифрования: ");
            String text = in.nextLine();

            System.out.println("введите ключ: ");
            int key = in.nextInt();
            in.nextLine();
            String encrypted = getEncryptString(text, key);
            System.out.println("текст после преобразования: " + encrypted);

            System.out.println("выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine();

            if (answer.equals("y")) {
                String decrypted = getEncryptString(encrypted, -key);
                System.out.println("текст после обратного преобразования: " + decrypted);
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
            } else {
                System.out.println("Введите корректный ответ");
            }

            in.close();
        }
}

