package java_43;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.timMin(5, 5));
        System.out.println(myMath.timMin(5.5, 6.0));

        System.out.println(myMath.tinhTong(5, 5));
        double arr[] = new double[]{1,2,3,4,5};
        System.out.println(myMath.tinhTong(arr));
    }
}
