import java.util.Scanner;

public class Bai2 {
    /*
    * Nhập vào chương trình 2 số nguyên dương a,b,c
    * In ra màn hình kết luận về tam giác có 3 cạnh trên
    * (tam giác thường, tam giác vuông, tam giác cân,
    * tam giác vuông cân, tam giác đều hoặc không phải tam giác)*/
    public static void main(String[] args) {
        kiemTraLoaiTamGiac();
    }
    public static void kiemTraLoaiTamGiac() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = in.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = in.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = in.nextInt();
        System.out.println("==============================================================");
        if (a + b > c && a + c > b && b + c > a ) {
            if (a == b && b == c){
                System.out.println("Tam giác đều");
            }
            else if (a == c || a == b || b == c){
                System.out.println("tam giác cân");
            }
            else if (isRightTriangle(a, b, c)) {
                System.out.println("Tam giác vuông");
            }
            else{
                System.out.println("Tam giác thường");
            }
        }
        else{
            System.out.println("không phải tam giác: ");
        }
    }
    private static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) ||
                (b * b + c * c == a * a) ||
                (a * a + c * c == b * b);
    }
}
