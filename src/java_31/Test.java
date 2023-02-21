package java_31;

public class Test {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
        HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
        System.out.println("Tong tien: " + hd.tinhTongTien());
        System.out.println("Kiem tra khoi luong > 2kg " + hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem tra tong tien > 500kg " + hd.kiemTraTongTienLonHon500k());
        System.out.println("Giam gia cua hd " +hd.giamGia(10));
        System.out.println("Giam gia cua hd2 " +hd2.giamGia(10));


        System.out.println("Sau giam gia cua hd " +hd.giaSauKhiGiam(10));
        System.out.println("Sau giam gia cua hd2 " +hd2.giaSauKhiGiam(10));
    }
}
