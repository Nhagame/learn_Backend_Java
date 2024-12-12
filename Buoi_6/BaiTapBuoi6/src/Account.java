import java.util.Date;

public class Account {
    // Thuộc tính
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Hàm khởi tạo mặc định
    public Account(int i, int i1) {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Hàm khởi tạo đầy đủ thông tin
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Phương thức
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Số tiền rút không hợp lệ!");
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền gửi không hợp lệ!");
        }
        return false;
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        // Tạo đối tượng Account
        Account account = new Account(1122, 20000, 4.5);

        // Rút tiền
        account.withdraw(2500);

        // Gửi tiền
        account.deposit(3000);

        // In ra thông tin
        System.out.println("Số dư hiện tại: $" + account.getBalance());
        System.out.println("Tiền lãi hàng tháng: $" + account.getMonthlyInterest());
        System.out.println("Ngày tài khoản được tạo: " + account.getDateCreated());
    }
}
