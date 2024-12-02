package buoi4;
import java.util.*;

public class Bai1aWordCounter {
    public static void main(String[] args) {
        String paragraph = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        // Loại bỏ dấu câu
        paragraph = paragraph.replaceAll("[\\p{Punct}]", "");

        // Tách thành các từ
        String[] words = paragraph.split("\\s+");

        // Khởi tạo map để đếm số lượng từ
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            // Chuyển về chữ thường
            word = word.toLowerCase();

            // Tăng số đếm
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // In kết quả
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(capitalize(entry.getKey()) + " : " + entry.getValue() + " từ");
        }
    }

    // Phương thức viết hoa chữ cái đầu tiên
    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}


