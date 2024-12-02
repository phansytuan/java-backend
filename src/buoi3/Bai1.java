package buoi3;

public class Bai1 {
    public static void main(String[] args) {
        for (int soTo1000 = 0; soTo1000 <= 200; soTo1000++) {
            for (int soTo2000 = 0; soTo2000 <= 100; soTo2000++) {
                for (int soTo5000 = 0; soTo5000 <= 40; soTo5000++) {
                    if (soTo1000 * 1000 + soTo2000 * 2000 + soTo5000 * 5000 == 200000) {
                        System.out.println("1000đ: " + soTo1000 + ", 2000đ: " + soTo2000 + ", 5000đ: " + soTo5000);
                    }
                }
            }
        }
    }
}
