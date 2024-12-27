package buoi4;

import java.util.*;
import java.util.stream.*;

public class Bai1aWordCounter {
    public static void main(String[] args) {
        // Đoạn văn bản gốc
        //String paragraph = "Tôi học lập trình, học lập trình rất hay";
        String paragraph = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";


        // 1) Loại bỏ những gì không phải chữ cái, chữ số, hoặc khoảng trắng
        //    (nếu muốn giữ lại một số ký tự, bạn có thể chỉnh sửa regex này)
        paragraph = paragraph.replaceAll("[^\\p{L}\\p{N}\\s]+", "");

        // 2) Tách chuỗi dựa trên khoảng trắng
        String[] words = paragraph.split("\\s+");

        // 3) Sử dụng Stream để đếm tần suất (không phân biệt hoa thường)
        Map<String, Long> wordCounts = Arrays.stream(words)
                .map(String::toLowerCase)                 // chuyển tất cả về chữ thường
                .collect(Collectors.groupingBy(w -> w,    // nhóm theo từ
                        Collectors.counting())); // đếm số lần xuất hiện

        // 4) Đưa kết quả vào danh sách và sắp xếp theo key (từ) để in gọn gàng
        List<Map.Entry<String, Long>> sortedWordCounts = new ArrayList<>(wordCounts.entrySet());
        sortedWordCounts.sort(Map.Entry.comparingByKey());  // sắp xếp theo bảng chữ cái

        // 5) In kết quả, viết hoa chữ cái đầu cho đẹp
        for (Map.Entry<String, Long> entry : sortedWordCounts) {
            System.out.printf("%s : %d từ%n", capitalize(entry.getKey()), entry.getValue());
        }
    }

    // Hàm viết hoa chữ cái đầu tiên của một chuỗi
    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
