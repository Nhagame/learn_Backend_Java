public class Bai2 {
    public static void main(String[] args) {
        String[] starNumber = {
                "0123-456-789",
                "0.123.456.789",
                "+84123456789",
                "84123456789",
                "123456789",
                "0123456789",
                "123-456-789",
                "0-123456789",
                "84-123456789",
                "06563456426436436"
        };
        for(String star : starNumber) {
            System.out.println(star + "=>" + ((isValidNumber(star) ? "Hợp lệ": "Không hợp lệ")));
        }
    }

    public static boolean isValidNumber(String str) {
        String Number = str.replaceAll("[^0-9]", "");
        if(Number.startsWith("0") && Number.length() == 10) {
            return true;
        }
        else if(Number.startsWith("84") && Number.length() == 11) {
            return true;
        }
        else if(Number.startsWith("84") && Number.length() == 12 && Number.contains("+")) {
            return true;
        }
        else if(Number.length() == 9){
            return true;
        }
        return false;
    }
}
