package buoi3;

public class Bai1 {
    public static void main(String[] args) {

        // Duyệt qua số lượng tờ 1.000đ, từ 0 đến 200 tờ (200.000 / 1.000)
        for (int soTo1000 = 0; soTo1000 <= 200; soTo1000++) {
            // Duyệt qua số lượng tờ 2.000đ, từ 0 đến 100 tờ (200.000 / 2.000)
            for (int soTo2000 = 0; soTo2000 <= 100; soTo2000++) {
                // Duyệt qua số lượng tờ 5.000đ, từ 0 đến 40 tờ (200.000 / 5.000)
                for (int soTo5000 = 0; soTo5000 <= 40; soTo5000++) {

                    // Kiểm tra tổng tiền từ 3 loại giấy bạc có bằng 200.000đ hay không
                    if (soTo1000 * 1000 + soTo2000 * 2000 + soTo5000 * 5000 == 200000) {

                        // Nếu điều kiện thỏa mãn, in ra phương án (soTo1000, soTo2000, soTo5000)
                        System.out.println("1000đ: " + soTo1000 + ", 2000đ: " + soTo2000 + ", 5000đ: " + soTo5000);
                    }
                }
            }
        }
    }
}
