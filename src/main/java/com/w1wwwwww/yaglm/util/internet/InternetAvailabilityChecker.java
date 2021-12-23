package com.w1wwwwww.yaglm.util.internet;

import java.net.HttpURLConnection;
import java.net.URL;

public class InternetAvailabilityChecker {
    public static String getInternetStatus(String url) {
        String result = "";
        try {
            URL urlObj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
            con.setRequestMethod("GET");
            // Set connection timeout
            con.setConnectTimeout(3000);
            con.connect();

            int code = con.getResponseCode();
            if (code == 200) {
                result = "On";
            }
        } catch (Exception e) {
            result = "Off";
        }
        return result;
    }
}
