package java_36;

public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 05, 2022);
        Ngay ngay2 = new Ngay(31, 01, 2025);
        Ngay ngay3 = new Ngay(16, 02, 2030);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Honda", "VN");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Ducati", "Ytalia");
        HangSanXuat hangSanXuat3 = new HangSanXuat("BWM", "Germany");

        BoPhim boPhim1 = new BoPhim("Haha", 2020, hangSanXuat1, 70000, ngay1);
        BoPhim boPhim2 = new BoPhim("Hehe", 2021, hangSanXuat2, 80000, ngay2);
        BoPhim boPhim3 = new BoPhim("Lala", 2022, hangSanXuat3, 75000, ngay3);

        System.out.println("So Sanh Gia 1 va 2 " +boPhim1.kiemTraGiaVeReHon(boPhim2));

        System.out.println("Ten hang san xuat phim 3: " + boPhim3.layTenHangSanXuat());

        System.out.println("Phim 1 giam 10% " + boPhim1.giaSauKhuyenMai(10));
    }
}
