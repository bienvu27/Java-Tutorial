import java.util.Scanner;

public class BaiTapHinhTron {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r:");
        r = sc.nextDouble();

        //Tinh chu vi
        chuVi = 2 * Math.PI * r;
        System.out.println("Chu vi = " + chuVi);

//        Tinh dien tich
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Dien tich =" + dienTich);
    }
}
