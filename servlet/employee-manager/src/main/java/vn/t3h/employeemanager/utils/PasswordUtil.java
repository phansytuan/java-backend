package vn.t3h.employeemanager.utils;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordUtil {
    private static final String ALGORITHM = "AES";
    private static SecretKey secretKey;

    // hàm mã hoá
    static {
        String secretKeyString= "mySuperSecretKey1234567890123456";
        byte[] secretKeyBytes = secretKeyString.getBytes(StandardCharsets.UTF_8);
        secretKey = new SecretKeySpec(secretKeyBytes, ALGORITHM);
    }
    public static String encryptPassword(String password) {
        try {
            Cipher cipher=Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            byte[] encryptBytes=cipher.doFinal(password.getBytes());
            return Base64.getEncoder().encodeToString(encryptBytes);
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException |
               BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    // hàm giải mã
    public static String decryptPassword(String password) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            byte[] decryptBytes = cipher.doFinal(Base64.getDecoder().decode(password));
            return new String(decryptBytes, StandardCharsets.UTF_8);
        }
        catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | IllegalBlockSizeException |
                 BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(encryptPassword("admin"));
        System.out.println(encryptPassword("user"));
    }
}
