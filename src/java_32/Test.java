package java_32;

public class Test {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(31, 1, 2023);
        System.out.println("Day = " +myDate.getDay());

        myDate.setDay(20);
        System.out.println("Day = " +myDate.getDay());

    }
}
