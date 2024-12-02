import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int array = sc.nextInt();
        sc.nextLine();  // Đọc dòng mới sau khi nhập số nguyên
        int[] n = new int[array];
        Nhapmang(n);
        Xuatmang(n);
        Tong(n);
        /// in ra số nguyên tố tronng mảng
        System.out.println("Số nguyên tố trong mảng là: ");
        for (int i = 0; i < n.length; i++) {
            if (Songuyento(n[i])) {
                System.out.print(n[i] + " ");
            }
        }
        // mang sắp xếp
        sapxep(n,true);
        System.out.println("Mảng sau khi sắp xếp: ");
        InMang(n);

        // mang có số lowns và nhỏ hơn avg
        SapXepTrungBinh(n);

        //tìm kiessm các số trùng lặp
        TimkiemPhanTuTrungLap(n);

        //thêm giá trị ở vị trí maảng

        n= nhapPhanTu(n);
        System.out.println("mảng sau khi thêm phần tử mới ở vị trí chỉ định: " + Arrays.toString(n));

        n=XoaGiatri(n);
        System.out.println("Mảng sau khi xóa phần tử mới: " + Arrays.toString(n));
    }



    //nhập mảng
    public static void Nhapmang(int[] nhapmang) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nhapmang.length; i++) {
            System.out.println("Mảng thứ "+ i +":"   );
            nhapmang[i] = Integer.parseInt(sc.nextLine());
        }
    }
    //xuất mảng
    public static void Xuatmang(int[] nhapmang) {
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < nhapmang.length; i++) {
            System.out.print(nhapmang[i] + " ");
        }
        System.out.println();
    }
    //tính tổng phần tử chẵn lẻ
    public static void Tong(int[] nhapmang) {
        int tongle = 0;
        int tongchan = 0;
        for (int i = 0; i < nhapmang.length; i++) {

            if((nhapmang[i] % 2) == 0){
                tongchan += nhapmang[i];
            }
            else {
                tongle += nhapmang[i];
            }
        }
        System.out.println("tổng các số lẻ trong mảng: " + tongle);
        System.out.println("tổng các số chẵn trong mảng: " + tongchan);
    }
    // so nguyen to
    public static boolean Songuyento(int n) {
        if(n < 2) {
            return false;
                }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true ;
    }
    // sắp xếp theo giảm của lẻ và tăng của chẵn
    public static void sapxep(int[] mang, boolean list) {
        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = 0; j < mang.length - i - 1; j++) {
                if ((mang[j] % 2 == 0 && mang[j] < mang[j + 1] && list) ||
                        (mang[j] % 2 != 0 && mang[j] > mang[j + 1] && !list)) {
                    int temp = mang[j];
                    mang[j] = mang[j + 1];
                    mang[j + 1] = temp;
                }
            }
        }
    }
    public static void InMang(int[] mang) {
        for (int num : mang) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // sắp mảng lớn hơn và nhỏ hơn
    public static void SapXepTrungBinh(int[] mang){
        double sum = 0;
        for(int i = 0; i < mang.length; i++) {
            sum = sum + mang[i];
        }
        double avg = sum / mang.length;
        System.out.println("Số trung bình của mảng là: " + avg);
        int DemMang1 = 0;
        int DemMang2 = 0;
        for(int i = 0; i < mang.length; i++) {
            if (mang[i] <= avg) {
                DemMang1++;
            } else {
                DemMang2++;
            }

        }
        int[] Dem1 = new int[DemMang1];
        int[] Dem2 = new int[DemMang2];
        int chiSo1 = 0; int chiSo2 = 0;
        for (int i = 0; i< mang.length; i++) {
            if(mang[i] <= avg){
                Dem1[chiSo1++] = mang[i];
            }
            else{
                Dem2[chiSo2++] = mang[i];
            }
        }
        System.out.println("Mảng có các số nhỏ hơn số trung bình: " + Arrays.toString(Dem1));
        System.out.println("Mảng có các số lớn hơn số trung bình: " + Arrays.toString(Dem2));
    }
    //tìm kiếm phần tử trùng lặp
    public static void TimkiemPhanTuTrungLap(int[] mang){
        int SolanXuathien = 0;
        for (int i = 0; i < mang.length; i++) {
            boolean kiemtraSolanXuathien = false;
            for (int j = 0; j < i; j++) {
                if(mang[i] == mang[j]) {
                    kiemtraSolanXuathien = true;
                    break;
                }
                }
            if(kiemtraSolanXuathien) {
                System.out.println("các phần tử trùng lặp " + mang[i]);
                SolanXuathien++;
            }
        }
        System.out.println(" Số phần tử trùng lặp: " + SolanXuathien);
    }
    public static int[] nhapPhanTu(int[] mang){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí:");
        int Vitri = sc.nextInt();
        System.out.println(" nhập giá trị : ");
        int GiaTri = sc.nextInt();
        if(Vitri < 0 || Vitri > mang.length ) {
            throw new IndexOutOfBoundsException("Vị trí bạn điền là sai");
        }
        int[] mangmoi = Arrays.copyOf(mang, mang.length + 1);
        for (int i = mang.length - 1; i >= Vitri; i--) {
            mangmoi[i + 1] = mangmoi[i];
        }
        mangmoi[Vitri] = GiaTri;
        return mangmoi;
    }
    //Xóa phần t trong mảng
    public static int[] XoaGiatri(int[] mang){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập phần tử cần xóa: ");
        int Vitri = sc.nextInt();
        int[] mangmoi = new int[mang.length];
        int chisomoi = 0;
        for(int i = 0; i < mang.length; i++) {
            if(mang[i]!=Vitri){
                mangmoi[chisomoi++] = mang[i];
            }
        }
        return mangmoi;
    }
}
