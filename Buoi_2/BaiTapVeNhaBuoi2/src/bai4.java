import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập số từ 1 đến 4!");
                System.out.print("Chọn chức năng: ");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Bai1.tinhDiemsinhvien();
                    break;
                case 2:
                    Bai2.kiemTraLoaiTamGiac();
                    break;
                case 3:
                    Bai3.tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    // Hiển thị menu
    public static void showMenu() {
        System.out.println("+---------------------+");
        System.out.println("1. Tính điểm sinh viên");
        System.out.println("2. Kiểm tra loại tam giác");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------+");
    }
}
