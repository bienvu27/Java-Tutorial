package java_37;

public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(12, 01, 2000);
        Ngay ngay2 = new Ngay(15, 01, 2001);
        Ngay ngay3 = new Ngay(12, 01, 2000);

        Lop lop1 = new Lop("PH01", "CNTT");
        Lop lop2 = new Lop("PH02", "KE TOAN");
        Lop lop3 = new Lop("PH03", "JAVA");

        SinhVien sv1 = new SinhVien("PH05562", "Bien Vu", "Vu", ngay1, 10, lop1);
        SinhVien sv2 = new SinhVien("PH05563", "Bien Vu2", "Vu2", ngay2, 9, lop2);
        SinhVien sv3 = new SinhVien("PH05564", "Bien Vu3", "Vu3", ngay3, 8, lop3);

        System.out.println("Ten Khoa: " + sv1.layTenKhoa());
        System.out.println("Ten Khoa: " + sv2.layTenKhoa());
        System.out.println("Ten Khoa: " + sv3.layTenKhoa());

        System.out.println("Kiem tra thi dat: " + sv1.kiemTraThiDat());
        System.out.println("Kiem tra thi dat: " + sv2.kiemTraThiDat());
        System.out.println("Kiem tra thi dat: " + sv3.kiemTraThiDat());

        System.out.println("sv1 va sv3: " + sv1.kiemTraCungNgaySinh(sv3));
    }
}
