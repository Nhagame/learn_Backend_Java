import java.util.Scanner;

public class Bai1 {
    /*Viết chương trình Java tính điểm của sinh viên.
    Chương trình này sẽ đọc vào các loại điểm của sinh viên
    (điểm chuyên cần, điểm giữa kỳ, và điểm cuối kỳ)
    và xếp loại điểm theo quy luật sau:
        – if điểm trung bình >=9 =>loại=A
        – if điểm trung bình >= 7 và <9 => loại=B
        – if điểm trung bình>=5 and <7 =>loại=C
        – if điểm trung bình<5 =>loại=D*/
    public static void main(String[] args) {
        tinhDiemsinhvien();
    }

    public static void tinhDiemsinhvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tính điểm của sinh viên. Bạn hãy nhập điểm: ");
        int Diem = sc.nextInt();
        if(Diem >= 9) {
            System.out.println( "Diểm của bạn là: "+ Diem + " Bạn thuộc loại: A ");
        }
        else if(Diem >= 7 && Diem < 9) {
            System.out.println( "Diểm của bạn là: "+ Diem + " Bạn thuộc loại: B ");
        }
        else if(Diem >= 5 && Diem < 7) {
            System.out.println( "Diểm của bạn là: "+ Diem + " Bạn thuộc loại: C ");
        }
        else if(Diem < 5) {
            System.out.println( "Diểm của bạn là: "+ Diem + " Bạn thuộc loại: D ");
        }
        System.out.println("=======================================================");
        System.out.println("Kết thúc chương trình.");
    }
}
