package Buoi10;

public class Bai1{
    public static void main(String[] args) {
        final int[] totalSum = {0};

        // Thread 1
        Thread thread1 = new Thread(() -> {
            int sum = 0;

            // Tính tổng từ 1 đến 5
            for (int i = 1; i <= 5; i++) {
                sum += i;
            }
            // Đồng bộ hóa khi cập nhật giá trị tổng vào biến totalSum
            synchronized (totalSum) {
                totalSum[0] += sum;
            }
            System.out.println("Thread 1 (sum 1-5): " + sum);
            // Kết quả của thread 1
        });


        // Thread 2: Tính tổng từ 6 đến 10
        Thread thread2 = new Thread(() -> {
            int sum = 0;
            for (int i = 6; i <= 10; i++) {
                sum += i;
            }
            synchronized (totalSum) {
                totalSum[0] += sum;
            }
            System.out.println("Thread 2 (sum 6-10): " + sum);
        });


        //  Bắt đầu / Khởi chạy các thread
        thread1.start();
        thread2.start();


        // Chờ các thread hoàn thành công việc bằng cách gọi join()
        try {
            thread1.join();   // Thread chính chờ thread 1 xong
            thread2.join();   // Thread chính chờ thread 2 xong
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            // Xử lý ngoại lệ nếu bị ngắt giữa chừng
        }

        // Thread chính tiếp tục chạy (sau khi cả hai thread 1, 2 đã hoàn thành)
        System.out.println("Total Sum (1-10): " + totalSum[0]);
    }
}

