package java_61;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    //    1. Them danh sach sinh vien
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

//    2. In danh sach sinh vien ra man hinh

    public void inDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    //    3. Kiem tra danh sach co rong hay khong
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

//    4. Lay ra so luong sinh vien trong danh sach

    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    //    5. Lam rong danh sach
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    //    6. Kiem tra ton tai
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    //    7.
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    //    8.
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            } else {
                System.out.println("Khong tim thay");
            }
        }
    }

    //    9.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
                    return 1;
                } else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
