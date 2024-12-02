package buoi4;

public class Bai1cRemoveVowels {
    public static void main(String[] args) {
        String text = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995.";

        String noVowels = text.replaceAll("[aeiouAEIOUáàảãạăắằẳẵặâấầẩẫậóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựíìỉĩịýỳỷỹỵêếềểễệ]", "");

        System.out.println(noVowels);
    }
}
