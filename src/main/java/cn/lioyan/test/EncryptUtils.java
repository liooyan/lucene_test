package cn.lioyan.test;

import cn.hutool.core.io.FileUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.util.Base64;

public class EncryptUtils {

    private static final String SECRET = "AES";
    private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS7Padding";

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * AES加密ECB模式PKCS7Padding填充方式
     * @param str 字符串
     * @param key 密钥
     * @return 加密字符串
     * @throws Exception 异常信息
     */
    public static byte[]  aes256ECBPkcs7PaddingEncrypt(  byte[] encryptByte , String key) throws Exception {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyBytes, SECRET));
        byte[] doFinal = cipher.doFinal(encryptByte);
        return doFinal;
    }

    /**
     * AES解密ECB模式PKCS7Padding填充方式
     * @param str 字符串
     * @param key 密钥
     * @return 解密字符串
     * @throws Exception 异常信息
     */
    public static String aes256ECBPkcs7PaddingDecrypt( byte[] str, String key) throws Exception {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyBytes, SECRET));
        byte[] doFinal = cipher.doFinal(str);
        return new String(doFinal);
    }
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Administrator\\Desktop\\各种软件\\fsdownload\\configuration\\111-out.txt");

        byte[] encryptByte = FileUtil.readBytes(file);


//        String decryptStr = EncryptUtils.aes256ECBPkcs7PaddingDecrypt(encryptByte, "wondersoft--2021");
//        System.out.println("解密后字符串：" + decryptStr);
        byte[] bytes = EncryptUtils.aes256ECBPkcs7PaddingEncrypt(encryptByte, "wondersoft--2021");


        FileUtil.writeBytes(bytes,"C:\\Users\\Administrator\\Desktop\\各种软件\\fsdownload\\configuration\\strategy-test.json");

    }

}
