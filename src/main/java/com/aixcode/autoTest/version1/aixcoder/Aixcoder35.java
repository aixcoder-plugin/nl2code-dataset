package com.aixcode.autoTest.version1.aixcoder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class Aixcoder35 {
    /**
     * Create and returns a HttpURLConnection connection to a webpage
     */
    public HttpURLConnection createHttpConnection(URL url, int connectTimeout, Map<String, String> requestProperties) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(connectTimeout);
        connection.setReadTimeout(connectTimeout);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length", "0");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestProperty("Content-Language", "en-US");

        if (requestProperties != null) {
            for (Map.Entry<String, String> entry : requestProperties.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }

        return connection;
    }
}
