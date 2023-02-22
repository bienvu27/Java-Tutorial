package java_45;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;


    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHanSanXuat();
    }

    public void batDau() {
        System.out.println("Bat Dau...");
    }

    public void tangToc() {
        System.out.println("Tang Toc...");
    }

    public void dungLai() {
        System.out.println("Dung lai...");
    }

    public abstract double layVanToc();
}
