package java_64;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuThuong = new HashSet<String>();

    public RutThamTrungThuong_HashSet() {
    }

    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaPhieuDuThuong() {
        this.thungPhieuDuThuong.clear();
    }

    public int laySoLuong() {
        return this.thungPhieuDuThuong.size();
    }

    public String rutMotPhieu() {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }


    public static void main(String[] args) {

        int luaChon = 0;
        do {
            System.out.println("--------------------");
            System.out.println("Menu: ");
            System.out.println("1. Them ma so du thuong.");
            System.out.println("2. Xoa ma so du thuong.");
            System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong?");
            System.out.println("4. Xoa tat ca cac phieu du thuong.");
            System.out.println("5. So luong phieu du thuong.");
            System.out.println("6. Rut tham trung thuong.");
            System.out.println("0. Thoat khoi chuong trinh.");

        } while (luaChon != 0);
    }
}