import java.util.Scanner;

public class Java11 {
    //    Cac phep toan co ban
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a = ");
        a = sc.nextInt();
        System.out.println("Nhap vao b = ");
        b = sc.nextInt();

        int tong = a + b;

        System.out.println(a + "+" + b + "=" + tong);

        System.out.println(tong);
    }
}
