package java_54;

public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(100, "bien vu", "5562", 9);
        SinhVien sinhVien2 = new SinhVien(150, "bien vu 2", "5563", 8);

        System.out.println(sinhVien.compareTo(sinhVien2));
    }
}
