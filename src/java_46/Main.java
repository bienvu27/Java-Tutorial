package java_46;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test cau a:");

        MayTinhCasioFX500 mayTinhCasioFX500 = new MayTinhCasioFX500();
        MayTinhVinaCall500 mayTinhVinaCall500 = new MayTinhVinaCall500();

        System.out.println("5+3=" + mayTinhCasioFX500.cong(5, 3));

        System.out.println("Test cau b: ");
        double[] arr = new double[]{5,1,3,4,5,8,0};
        double[] arr2 = new double[]{6,2,7,9,2,4,5};

        SapXepChen sapXepChen = new SapXepChen();
        SapXepChon sapXepChon = new SapXepChon();

        sapXepChen.sapXepTang(arr);
        for (int i = 0 ; i< arr.length; i++){
//            double d = arr[i];
            System.out.println(arr[i]);
        }
        sapXepChon.sapXepGiam(arr2);
        for (int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
