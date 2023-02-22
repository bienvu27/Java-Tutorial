package java_44;

public class Main {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo(5, 5);
        ToaDo toaDo2 = new ToaDo(7, 9);
        ToaDo toaDo3 = new ToaDo(12, 1);

        Hinh h1 = new Diem(toaDo1);
        Hinh h2 = new HinhTron(toaDo2, 10);
        Hinh h3 = new HinhChuNhat(toaDo3, 5, 10);

        System.out.println("DT1: "+h1.tinhDienTich());
        System.out.println("DT2: "+h2.tinhDienTich());
        System.out.println("DT3: "+h3.tinhDienTich());
    }
}
