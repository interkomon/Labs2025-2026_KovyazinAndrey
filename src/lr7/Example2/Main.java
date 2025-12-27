package lr7.Example2;

public class Main {
    public static void main(String[] args) {

        // объект суперкласса
        SuperClass2 superObj = new SuperClass2("Текст суперкласса");
        System.out.println("Длина строки суперкласса: " + superObj.getTextLength());

        // объект подкласса
        SubClass2 subObj = new SubClass2("Текст подкласса", 10);


        subObj.setValue();
        subObj.print();

        subObj.setValue("Новая строка");
        subObj.print();

        subObj.setValue(50);
        subObj.print();

        subObj.setValue("Строка и число", 77);
        subObj.print();

        subObj.setValue(88, "Число и строка");
        subObj.print();
    }
}
