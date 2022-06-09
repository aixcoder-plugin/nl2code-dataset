package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class AixcoderNew2 extends GenerateMethodBase {
    public HttpURLConnection createHttpConnection(URL url, int connectTimeout, Map<String, String> requestProperties)
            throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(connectTimeout);
        connection.setDoInput(true);
        if (requestProperties != null) {
            for (Map.Entry<String, String> requestProperty : requestProperties.entrySet()) {
                String key = requestProperty.getKey();
                String value = requestProperty.getValue();
                connection.addRequestProperty(key, value);
            }
        }
        return connection;
    }
}
