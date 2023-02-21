package java_35;

public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 5, 2023);
        Ngay ngay2 = new Ngay(15, 9, 2025);
        Ngay ngay3 = new Ngay(15, 9, 2023);

        TacGia tacGia1 = new TacGia("Bien Vu", ngay1);
        TacGia tacGia2 = new TacGia("Nguyen Vu", ngay2);
        TacGia tacGia3 = new TacGia("Lee Nguyen", ngay3);

        Sach sach1 = new Sach("Java", 500, 2021, tacGia1);
        Sach sach2 = new Sach("PHP", 900, 2021, tacGia2);
        Sach sach3 = new Sach("Flutter", 1500, 2029, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sanh NXB sach1 va sach2 " + sach1.kiemTraCungNamXuanBan(sach2));
        System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10));

    }
}
