package _0522;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StreamMain {
    public static void main(String[] args) {
        String str = "할리스a";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        InputStream is = new ByteArrayInputStream(bytes);
        BufferedInputStream bis = new BufferedInputStream(is, 8192);
        InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);

        try {
            int r = isr.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
