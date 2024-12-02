import java.util.Scanner;

public class Bai3 {

    // Kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    // Kiểm tra số Armstrong
    public static boolean isArmstrongNumber(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    // Kiểm tra số đối xứng
    public static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Tính tổng các chữ số
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một dãy số nguyên dương, cách nhau bởi khoảng trắng:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);

            // Kiểm tra số hoàn hảo
            if (isPerfectNumber(num)) {
                System.out.println(num + " là số hoàn hảo.");
            } else {
                System.out.println(num + " không phải là số hoàn hảo.");
            }

            // Kiểm tra số Armstrong
            if (isArmstrongNumber(num)) {
                System.out.println(num + " là số Armstrong.");
            } else {
                System.out.println(num + " không phải là số Armstrong.");
            }

            // Kiểm tra số đối xứng
            if (isPalindrome(num)) {
                System.out.println(num + " là số đối xứng.");
            } else {
                System.out.println(num + " không phải là số đối xứng.");
            }

            // Tính tổng các chữ số
            int sumDigits = sumOfDigits(num);
            System.out.println("Tổng các chữ số của " + num + " là: " + sumDigits + ".");
            System.out.println();
        }

        scanner.close();
    }
}
