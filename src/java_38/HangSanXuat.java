package java_38;

public class HangSanXuat {
    private String tenHanSanXuat;
    private QuocGia quocGia;

    public HangSanXuat(String tenHanSanXuat, QuocGia quocGia) {
        this.tenHanSanXuat = tenHanSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHanSanXuat() {
        return tenHanSanXuat;
    }

    public void setTenHanSanXuat(String tenHanSanXuat) {
        this.tenHanSanXuat = tenHanSanXuat;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public String layTenQuocGia() {
        return this.quocGia.getTenQuocGia();
    }
}
