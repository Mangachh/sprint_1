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

    public static void encryptFile(final SecretKey key, final IvParameterSpec iv,
            final String inputPath, final String outputPath) {
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(CRYPT_ALG);
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e1) {
            e1.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
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
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(CRYPT_ALG);
            cipher.init(Cipher.DECRYPT_MODE, key, iv);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e1) {
            e1.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }

        try (FileInputStream inputStream = new FileInputStream(cryptedFile)) {
            OutputStreamWriter outputStream = new OutputStreamWriter( new FileOutputStream(decryptedFile), StandardCharsets.UTF_8);
            byte[] buffer = new byte[64];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null) {
                    outputStream.write(new String(output));
                }
            }
            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                outputStream.write(new String(outputBytes));
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

    // metemos todo esto a mano, obviamente en producción deberíamos generar
    // contraseñas y todo eso.
    public static SecretKeySpec getSecretKey() {
        SecretKeyFactory factory;
        try {
            factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(PASS.toCharArray(), SALT.getBytes(), 65536, 256);
            SecretKey tmp = factory.generateSecret(spec);
            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
            return secretKey;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }
}
