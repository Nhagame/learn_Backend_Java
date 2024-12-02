package Buoi2;

import java.util.Scanner;

public class buoi2 {
    //phương triình ax+ b = 0
    public static int Phuongtrinh1(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình vô số nghiệm");
            } else if (b != 0) {
                System.out.println("phương trình vô nghêm");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm duy nhất X = " + x);
        }
        return 0;
    };

    // PHương trinh ax2 +bx +x = 0
    public static int Phuongtrinh2(int a, int b, int c) {
        int DelTa = b*b-4*a*c;
        System.out.println(DelTa);
        if (DelTa > 0) {
            System.out.println((-b + Math.sqrt(DelTa))/(2*a));
            System.out.println((-b - Math.sqrt(DelTa))/(2*a));
        } else if (DelTa == 0) {
            System.out.println(-b/2*a);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
        return 0;
    };
    // số giờ làm và tien luong
    public static int Luong(int a){
        double luongTheoGio = 50000;
        double  GioTieuChuan = 40;
        double TongLuongNhan;
        double HeSo =1.5;
        if(GioTieuChuan<=a){
            TongLuongNhan = a * luongTheoGio;
        }
        else{
            TongLuongNhan = (a - GioTieuChuan) * (luongTheoGio * HeSo) + (GioTieuChuan * luongTheoGio);
        }
      return 0;
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập số c: ");
        int c = scanner.nextInt();
//        int tong =  Phuongtrinh1(a,b);
//        System.out.println(tong);
        int tong = Phuongtrinh2(a, b, c);
        System.out.println("kết quả phương trình: "+tong);
    }
}
