import java.util.Scanner;

public class Java16 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b: ");
        b = sc.nextDouble();

//        Ham tri tuyet doi
        System.out.println("|a|=" + Math.abs(a));
//        Ham tim min
        System.out.println("min(a,b)" + Math.min(a, b));
//        Ham tim max
        System.out.println("max(a,b)" + Math.max(a, b));

    }
}
