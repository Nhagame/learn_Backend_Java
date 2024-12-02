import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số để đảo ngược : ");
        int a = sc.nextInt();
        int reversed = 0;
        for (int i = a; a != 0; a /= 10) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
           
        }
        System.out.println("Số đảo ngược là: " + reversed);
    }
}
