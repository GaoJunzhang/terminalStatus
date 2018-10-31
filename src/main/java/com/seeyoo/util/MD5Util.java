package com.seeyoo.util;


import org.springframework.util.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util
{
    protected static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
            'f'};
    protected static MessageDigest messagedigest = null;

    static {
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        }
    }

    private static String bufferToHex(byte bytes[])
    {
        return bufferToHex(bytes, 0, bytes.length);
    }

    private static String bufferToHex(byte bytes[], int m, int n)
    {
        StringBuffer stringbuffer = new StringBuffer(2 * n);
        int k = m + n;
        for (int l = m; l < k; l++) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }

    private static void appendHexPair(byte bt, StringBuffer stringbuffer)
    {
        char c0 = hexDigits[(bt & 0xf0) >> 4];
        char c1 = hexDigits[bt & 0xf];
        stringbuffer.append(c0);
        stringbuffer.append(c1);
    }

    public static boolean checkPassword(String password, String md5PwdStr)
    {
        String s = getMD5String(password);
        return s.equals(md5PwdStr);
    }

    public static String getFileMD5String(File file) throws IOException
    {
        FileInputStream in = new FileInputStream(file);
        FileChannel ch = in.getChannel();
        MappedByteBuffer byteBuffer = ch.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
        messagedigest.update(byteBuffer);
        return bufferToHex(messagedigest.digest());
    }

    public static String getMD5String(String s)
    {
        return getMD5String(s.getBytes());
    }

    public static String getMD5String(byte[] bytes)
    {
        messagedigest.update(bytes);
        return bufferToHex(messagedigest.digest());
    }

    public static String getLargeMD5(String path) throws IOException, NoSuchAlgorithmException
    {

        File f = new File(path);

        if (!f.exists()) {
            return null;
        }

        InputStream ins = new FileInputStream(f);

        byte[] buffer = new byte[8192];

        int len;
        while ((len = ins.read(buffer)) != -1) {
            messagedigest.update(buffer, 0, len);
        }

        ins.close();

        return DigestUtils.md5DigestAsHex(messagedigest.digest());
    }

    public static String getMD5(String path) throws IOException
    {
        InputStream ins = null;
        try {
            File f = new File(path);

            if (!f.exists()) {
                return null;
            }
            ins = new FileInputStream(f);
            return DigestUtils.md5DigestAsHex(ins);
        } finally {
            ins.close();
        }
    }

    /**
     * 获取该输入流的MD5值
     */
    public static String getMD5(InputStream is) throws NoSuchAlgorithmException, IOException
    {
        StringBuffer md5 = new StringBuffer();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] dataBytes = new byte[1024];

        int nread = 0;
        while ((nread = is.read(dataBytes)) != -1) {
            md.update(dataBytes, 0, nread);
        }
        ;
        byte[] mdbytes = md.digest();

        // convert the byte to hex format
        for (int i = 0; i < mdbytes.length; i++) {
            md5.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return md5.toString();
    }
}