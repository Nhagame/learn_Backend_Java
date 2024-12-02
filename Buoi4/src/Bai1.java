
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int n = in.nextInt();
        int[] Array = new int[n];
        nhapmang(Array);
        hienmang(Array);
        Max(Array);
        Min(Array);
        Sapxep(Array);
        Tong(Array);
        }

        public static void Tong(int[] Array) {
        int tong = 0;
        System.out.println("Tổng là: ");
        for (int i = 0; i < Array.length; i++) {
            tong+= Array[i];
        }
        System.out.println(tong);
        }

    public static void Sapxep(int[] Array) {
        int n = Array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                    hienMangsapxep(Array);
                }
            }
        }
    }

    public static void hienMangsapxep(int[] Array) {
        int n = Array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + "  ");
        }
    }
    public static void Max(int[] Array) {
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
            else if (max > Array[i]) {
                max = max;
            }
        }
        System.out.println("Phần tử lớn nhất: "+max);
    }

    public static void Min(int[] Array) {
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
            else if (min < Array[i]) {
                min = min;
            }
        }
        System.out.println("Phần tử nhỏ nhất: "+min);
    }

    public static void TongMang(int[] Array) {
        int tong = 0;
        for (int i = 0; i < Array.length; i++) {
            tong += Array[i];
            System.out.println(tong);
        }
    }

    public  static void hienmang(int[] Array){
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Phần tử thứ " + i + ":" + Array[i]);
        }
    }

    public static void nhapmang(int[] Array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i +":" );
            int a = scanner.nextInt();
            Array[i] = a;
        }
    }

}
