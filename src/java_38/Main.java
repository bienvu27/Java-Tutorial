package java_38;

public class Main {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 8, 2025);
        Ngay ngay2 = new Ngay(1, 3, 2025);
        Ngay ngay3 = new Ngay(6, 9, 2025);

        QuocGia quocGia1 = new QuocGia("VN", "VN");
        QuocGia quocGia2 = new QuocGia("USA", "Hoa Ky");
        QuocGia quocGia3 = new QuocGia("PL", "Ba Lan");

        HangSanXuat hangSanXuat1 = new HangSanXuat("Macbook", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Dell", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Lenovo", quocGia3);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 1500, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 1600, 34);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 1700, 24);

        System.out.println("So sanh gia M1 va M2: "+mayTinh1.kiemTraGiaThapHon(mayTinh2));
        System.out.println("Ten quoc gia: " + mayTinh3.layTenQuocGia());
    }
}
