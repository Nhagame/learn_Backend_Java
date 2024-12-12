import java.util.Scanner;

class Accounta {
    private int id;
    private double balance;

    public Accounta(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String withdraw(double amount) {
        if (amount > balance) {
            return "Số tiền rút vượt quá số dư!";
        } else if (amount <= 0) {
            return "Số tiền rút phải lớn hơn 0!";
        } else {
            balance -= amount;
            return "Rút tiền thành công. Số dư mới: $" + balance;
        }
    }

    public String deposit(double amount) {
        if (amount <= 0) {
            return "Số tiền gửi phải lớn hơn 0!";
        } else {
            balance += amount;
            return "Gửi tiền thành công. Số dư mới: $" + balance;
        }
    }
}

public class AccountATM { // Đổi tên lớp chính
    public static void main(String[] args) {
        // Khởi tạo danh sách tài khoản
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Nhập ID tài khoản
                System.out.print("Nhập ID tài khoản (0-9): ");
                int id = scanner.nextInt();

                if (id < 0 || id > 9) {
                    System.out.println("ID không hợp lệ! Vui lòng nhập lại.");
                    continue;
                }

                Account account = accounts[id];

                while (true) {
                    // Hiển thị menu
                    displayMenu();
                    System.out.print("Lựa chọn của bạn: ");
                    int choice = scanner.nextInt();

                    if (choice == 1) { // Xem số dư
                        System.out.println("Số dư hiện tại: $" + account.getBalance());

                    } else if (choice == 2) { // Rút tiền
                        System.out.print("Nhập số tiền cần rút: ");
                        double amount = scanner.nextDouble();
                        System.out.println(account.withdraw(amount));

                    } else if (choice == 3) { // Gửi tiền
                        System.out.print("Nhập số tiền cần gửi: ");
                        double amount = scanner.nextDouble();
                        System.out.println(account.deposit(amount));

                    } else if (choice == 4) { // Thoát
                        System.out.println("Đã thoát tài khoản.\n");
                        break;

                    } else {
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
                scanner.next(); // Xóa giá trị nhập không hợp lệ
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n===== MENU CHÍNH =====");
        System.out.println("1: Xem số dư");
        System.out.println("2: Rút tiền");
        System.out.println("3: Gửi tiền");
        System.out.println("4: Thoát");
    }
}
