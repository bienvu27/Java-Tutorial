package java_35;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuanBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namXuanBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuanBan = namXuanBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuanBan() {
        return namXuanBan;
    }

    public void setNamXuanBan(int namXuanBan) {
        this.namXuanBan = namXuanBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach() {
        System.out.println(this.tenSach);
    }

    public boolean kiemTraCungNamXuanBan(Sach sachKhac) {
//        if (sachKhac.namXuanBan == sachKhac.namXuanBan) {
//            return true;
//        } else {
//            return false;
//        }
        return this.namXuanBan == sachKhac.namXuanBan;
    }

    public double giaSauKhiGiam(double x){
        return this.giaBan*(1-x/100);
    }
}
