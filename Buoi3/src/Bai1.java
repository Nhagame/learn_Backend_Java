import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a ;
        long Tong = 0;
        do {
            System.out.println("Nhập một số bất kỳ lớn hơn 0: ");
            a = sc.nextLong();
            for (int i = 1; i <= a; i++) {
                Tong += Math.pow(i,3);
            }
        }while (a <= 0);
        System.out.println(Tong);
    }
}
