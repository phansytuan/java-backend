package buoi4;

public class Bai2PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\+84|84|0)\\d{9}$|^(\\+84|84|0)(\\d{3}[-.]\\d{3}[-.]\\d{3})$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        String testPhone = "+84888052003";
        System.out.println("Số điện thoại hợp lệ: " + isValidPhoneNumber(testPhone));
    }
}
