public class Bai1 {
    public static void main(String[] args) {
        String text =
                "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems" +
                        " do James Gosling khởi xướng và phát hành vào năm 1995. " +
                        "Phiên bản mới nhất của Java Standard Edition là Java SE 8. " +
                        "Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, " +
                        "nhiều cấu hình đã được xây dựng để phù hợp với nhiều " +
                        "loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng " +
                        "dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        String text_lower = text.toLowerCase();
        String text_clean = text_lower.replaceAll("\\p{Punct}", "");
        String Words;
//        Words = text_clean.split();
//        System.out.println(Words);
    }
}
