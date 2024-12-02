import java.util.Scanner;

public class Bai3 {
    /*Viết chương trình nhập vào số điện sử dụng của tháng và
    tính tiền điện theo phương pháp lũy tiến
       Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
       Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 120*/
    public static void main(String[] args) {
        tinhTienDien();
    }
    public static void tinhTienDien() {
        int SodienBac1 = 50;
//        giá tiền từ 0-50 kwh
        int GiatienBac1 = 1678;

        int SodienBac2 = 100;
//        Giá tiền từ 51-100 kwh
        int GiatienBac2 = 1734;

        int SodienBac3 = 200;
//        Giá tiền từ 101-200 kwh
        int GiatienBac3 = 2014;

        int SodienBac4 = 300;
//        Giá tiền bậc 4
        int GiatienBac4 = 2536;

        int SodienBac5 = 400;
//        giá tiền bậc 5
        int GiatienBac5 = 2834;

//        giá tiền bậc 6
        int GiatienBac6 = 2927;

        int Tonggiatien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện mà bạn đã sử dụng: ");
        int n = sc.nextInt();
        if(n > 0 & n < SodienBac1){
            Tonggiatien = n * GiatienBac1;
            System.out.println("Giá tiền điện của bạn là: " + Tonggiatien + " đồng");
        }
        else if(n > 51 & n < SodienBac2){
            Tonggiatien = (SodienBac1 * GiatienBac1) + ((n - SodienBac1 ) * GiatienBac2);
            System.out.println("Giá tiền điện của bạn là: " + Tonggiatien + " đồng");
        }
        else if(n > 101 & n < SodienBac3){
            Tonggiatien = (SodienBac1 * GiatienBac1) + (SodienBac1 * GiatienBac2) + ((n - SodienBac2 ) * GiatienBac3);
            System.out.println("Giá tiền điện của bạn là: " + Tonggiatien + " đồng");
        }
        else if(n > 201 & n < SodienBac4){
            Tonggiatien = (SodienBac1 * GiatienBac1) + (SodienBac1 * GiatienBac2) + (SodienBac2 * GiatienBac3) + ((n - SodienBac3 ) * GiatienBac4);
            System.out.println("Giá tiền điện của bạn là: " + Tonggiatien + " đồng");
        } else if (n > 301 & n < SodienBac5) {
            Tonggiatien = (SodienBac1 * GiatienBac1) + (SodienBac1 * GiatienBac2) + (SodienBac2 * GiatienBac3) + (SodienBac2 * GiatienBac4) + ((n - SodienBac4 ) * GiatienBac5);
            System.out.println("Giá tiền điện của bạn là: " + Tonggiatien + " đồng");
        }
        else if (n > 401) {
            Tonggiatien = (SodienBac1 * GiatienBac1) + (SodienBac1 * GiatienBac2) + (SodienBac2 * GiatienBac3) + (SodienBac3 * GiatienBac4) + (SodienBac2 * GiatienBac5) + ((n - SodienBac5 ) * GiatienBac6);
            System.out.println("Giá tiền điện của bạn là: " + Tonggiatien + " đồng");
        }
    }
}
