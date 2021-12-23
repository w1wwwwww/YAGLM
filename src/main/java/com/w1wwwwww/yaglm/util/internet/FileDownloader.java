package com.w1wwwwww.yaglm.util.internet;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileDownloader {
    public static void downloadFile(String url, String fileName) throws IOException {
        URL _url = new URL(url);
        try (InputStream input = _url.openStream();
             BufferedInputStream bufferedInput = new BufferedInputStream(input);
             FileOutputStream fileOutput = new FileOutputStream(fileName)) {
            byte[] d = new byte[1024];
            int i;
            while ((i = bufferedInput.read(d, 0, 1024)) != -1) {
                fileOutput.write(d, 0, i);
            }
        }
    }
}
