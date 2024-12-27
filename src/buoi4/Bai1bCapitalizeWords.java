package buoi4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1bCapitalizeWords {
    public static void main(String[] args) {
        String text = "ngôn ngữ lập trình java ban đầu được phát triển bởi sun microsystems do james gosling khởi xướng và phát hành vào năm 1995.";

        String[] words = text.split("\\s+");
        StringBuilder capitalizedText = new StringBuilder();

        // Viết hoa chữ đầu trong mỗi từ
        for (String word : words) {
            capitalizedText.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        System.out.println(capitalizedText.toString().trim());
    }
}