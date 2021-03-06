package tasca5.nivell3.Exercici1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class EnDeCrypt {

    private static final String CRYPT_ALG = "AES/CBC/PKCS5Padding";
    private static final String PASS = "pass_de_prueba";
    private static final String SALT = "ssssssss";
    
    private static Cipher getCipher(final SecretKey key, final IvParameterSpec iv, int mode) {
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(CRYPT_ALG);
            cipher.init(mode, key, iv);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.err.println(e.getMessage());
        } catch (InvalidKeyException e) {
            System.err.println(e.getMessage());
        } catch (InvalidAlgorithmParameterException e) {
            System.out.println(e.getMessage());
        }

        return cipher;
    }

    public static void encryptFile(final SecretKey key, final IvParameterSpec iv,
            final String inputPath, final String outputPath) {

        Cipher cipher = getCipher(key, iv, Cipher.ENCRYPT_MODE);
        if (cipher == null) {
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(inputPath)) {
            FileOutputStream outputStream = new FileOutputStream(outputPath);
            byte[] buffer = new byte[64];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null) {
                    outputStream.write(output);
                }
            }
            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                outputStream.write(outputBytes);
            }
            inputStream.close();
            outputStream.close();
        } catch (IllegalBlockSizeException | BadPaddingException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void deCryptFile(final SecretKey key, final IvParameterSpec iv,
            final String cryptedFile, final String decryptedFile) {

        Cipher cipher = getCipher(key, iv, Cipher.DECRYPT_MODE);
        if (cipher == null) {
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(cryptedFile)) {
            OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(decryptedFile),
                    StandardCharsets.UTF_8);
            // FileOutputStream outputStream = new FileOutputStream(decryptedFile);
            byte[] buffer = new byte[64];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null) {
                    System.out.println(new String(output, StandardCharsets.UTF_8));
                    outputStream.write(new String(output, StandardCharsets.UTF_8));
                }
            }
            System.out.println("byeeeeeeeeeeeeeee\n");
            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                outputStream.write(new String(outputBytes, StandardCharsets.UTF_8));
            }
            inputStream.close();
            outputStream.close();
        } catch (IllegalBlockSizeException | BadPaddingException | IOException e) {
            e.printStackTrace();
        }

    }

    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    // metemos todo esto a mano, obviamente en producci??n deber??amos generar
    // contrase??as o ponerlas como input
    public static SecretKeySpec getSecretKey() {
        SecretKeyFactory factory;
        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(PASS.toCharArray(), SALT.getBytes(), 65536, 256);
            SecretKey tmp = factory.generateSecret(spec);
            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
            return secretKey;
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.getMessage());
        } catch (InvalidKeySpecException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
}
