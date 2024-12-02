import java.util.Scanner;

public class Bai2 {
/*Đổi sang số nhị phân của 1 số nguyên dương n
Ví dụ nhập sao số dương 8 in ra màn hình số nhị phân của nó là 1000
7 -> 111
9 -> 1001
16 -> 10000
    Cách giải
    chia lấy dư n%2
    đảo ngược chuỗi

    dùng hàm cos sẵn
*/
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi sang nhị phân: ");
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        // cách nguyên thủy khi muoosn dùng với stringBulder
//        while (n > 0 ){
//            str.append(n%2);
//            n = n/2;
//        }
//        System.out.println(str.reverse());


    }
}

