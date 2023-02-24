package java_57;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000;

        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi", "VN");
//        NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 0;
        do {
            System.out.println("---Mời bạn lựa chọn---");
            System.out.println("Chọn (1) để tiếp tục chơi.");
            System.out.println("Chọn (Phím bất kỳ) để thoát.");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("---BẮT ĐẦU CHƠI---");
                System.out.println("---Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi) + ",Bạn muốn nhập vao nhiêu");
                double datCuoc = 0;

                do {
                    System.out.println("Đặt cược (<số tiền cược) <=" + numf.format(taiKhoanNguoiChoi) + ":");
                    datCuoc = sc.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                int luaChonTaiXiu = 0;
                do {
                    System.out.println("Chọn 1: <-> Tài hoặc 2 <-> Xỉu");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                Random xuXac1 = new Random();
                Random xuXac2 = new Random();
                Random xuXac3 = new Random();

                int giaTri1 = xuXac1.nextInt(5) + 1;
                int giaTri2 = xuXac2.nextInt(5) + 1;
                int giaTri3 = xuXac3.nextInt(5) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;
                System.out.println("Ket qua: " + giaTri1 + "-" + giaTri2 + "-" + giaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println(" : " + tong + " Nhà cái ăn hết, bn thua.");
                    System.out.println("TK của bạn còn là: " + numf.format(taiKhoanNguoiChoi));
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("Tổng là: " + tong + " Xỉu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Bạn đã thắng cược. ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("Bạn đã thua cược. ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }

                } else {
                    System.out.println("Tổng là: " + tong + " Tài");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("Bạn đã thắng cược. ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("Bạn đã thua cược. ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                }

            }
        } while (luaChon == 1);
    }
}
