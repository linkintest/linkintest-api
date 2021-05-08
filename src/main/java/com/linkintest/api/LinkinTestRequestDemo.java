package com.linkintest.api;


import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class LinkinTestRequestDemo {
    public static final String URL = "http://api.linkintest.com/detector/url";
    public static final String REQUEST_METHOD = "POST";
    public static final String USERNAME = "your username";
    public static final String PASSWORD = "your password";
    public static final String BODY =
            "{\n" +
                    "    \"appId\": \"id1276449806\",\n" +
                    "    \"countryCode\": \"HK\",\n" +
                    "    \"previewLink\": \"https://apps.apple.com/hk/app/id1276449806\",\n" +
                    "    \"testLink\": \"http://tracking.leomob.com/track?awno=lm157&oid=3141635\"\n" +
                    "}";

    public static void main(String[] args) {
        HttpRequest request = new HttpRequest();
        request.method(REQUEST_METHOD);
        request.set(URL);
        Map<String, String> headers = new HashMap();
        String authorization = "Basic ".concat(Base64.getEncoder().encodeToString(USERNAME.concat(":").concat(PASSWORD).getBytes()));
        headers.put("Authorization", authorization);
        request.header(headers);
        request.header("Content-Type", "application/json;charset=UTF-8");
        request.body(BODY);
        request.connectionTimeout(60000);
        request.timeout(120000);
        HttpResponse response = request.send();
        System.out.println(response.body());
    }
}

