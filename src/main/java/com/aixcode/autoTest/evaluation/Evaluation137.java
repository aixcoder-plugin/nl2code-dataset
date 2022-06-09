package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

public class Evaluation137 extends AbstractBaseEvaluation {
    public Evaluation137(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        List<HttpRequest> lsRequest = new ArrayList<>();
        try {
            lsRequest.add(HttpRequest.newBuilder().GET().uri(new URI("https://www.baidu.com")).build());
            lsRequest.add(HttpRequest.newBuilder().GET().uri(new URI("https://aixcoder.com/")).build());
            lsRequest.add(HttpRequest.newBuilder().GET().uri(new URI("http://testserver3.nnthink.com:8887/nl2code/")).build());
            lsRequest.add(HttpRequest.newBuilder().GET().uri(new URI("https://blog.csdn.net/")).build());
            lsRequest.add(HttpRequest.newBuilder().GET().uri(new URI("http://localhost:8080/")).build());
        } catch (URISyntaxException e) {
        }

        int pass_count = 0;
        int total_count = lsRequest.size();

        for(HttpRequest request : lsRequest) {
            String actualReturn = null;
            try {
                actualReturn = solution.getIPAddr(request);
                if(actualReturn != null) {
                    pass_count++;
                }
            } catch (Exception e) {
            }

        }
        return new int[]{pass_count, total_count};
    }
}
