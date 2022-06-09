package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.net.http.HttpRequest;

public class GenerateMethod137 extends GenerateMethodBase {
    /**
     *   获取request的IP地址
     */
    @Override
    public String getIPAddr(HttpRequest request) {
        // cannot resolve method name:request.remoteAddress()
        //return request.headers().firstValue("X-Forwarded-For").orElse(request.headers().firstValue("X-Real-IP").orElse(request.remoteAddress().getHostString()));
        return null;
    }
}
