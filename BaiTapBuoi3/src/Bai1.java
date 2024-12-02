public class Bai1 {
/*
* bài 1)
Cần có tổng 200.000đ từ 3 loại giấy bạc 1000đ, 2000đ, và 5000đ.
Lập chương tình để tìm tất cả các phương án có thể sử dụng các mệnh
* giá trên để tạo ra tổng 200.000đ
*
*
*   Giả sử :
*       x = 1000
*       y = 2000
*       z = 5000
*           x,y,z >= 0;
*   f(x) = 1,000x + 2,000y + 5,000z = 200,000
*/
    public static void main(String[] args) {
        Bai1();
    }

    public static void Bai1() {
        int count = 0;
        for(int x = 0; x <= 200; x++){
            for(int y = 0; y <= 100; y++){
                for(int z = 0; z <= 40; z++){
                    if(1000 * x + 2000 * y + 5000 * z ==200000){
                        if(x > 0 && y > 0 && z > 0){
                            count++;
                            System.out.println("Số tờ 1000 đ : " + x + " Số tờ 2000 đ : " + y + " Số tờ 5000 đ : " + z);
                        }
                    }
                }
            }
        }
        System.out.println("Có tổng số cách để có 3 tờ tổng l 200000: " + count);
    }
}