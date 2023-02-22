package java_45;

public class Main {
    public static void main(String[] args) {
        HangSanXuat hangSanXuat1 = new HangSanXuat("Hang 1", "VN");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Hang 2", "USA");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hang 3", "Nhat Ban");

        PhuongTienDiChuyen p1 = new MayBay("Haha", hangSanXuat1, "Xang");
        PhuongTienDiChuyen p2 = new XeOto("BMW", hangSanXuat2, "Dau");
        PhuongTienDiChuyen p3 = new XeDap("Mini", hangSanXuat3);
        System.out.println("Lay hang san xuat");
        System.out.println("p1: " + p1.layTenHangSanXuat());
        System.out.println("Bat dau: ");
        p2.batDau();
        System.out.println("Lay van toc: ");
        XeDap xeDap = new XeDap("Cao cao", hangSanXuat1);
        System.out.println(p3.layVanToc());

    }
}
