package com.test.webservice.demo.producingwebservice;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class ClaimRepository {
    private static final Map<String, ReqWS> reqws = new HashMap<>();

    @PostConstruct
    public static void initData() {
        ReqWS req = new ReqWS();
        req.setClaimno("F50000000");
        req.setNotifyno("HT4353245232");

        System.out.println(req.getName());

        reqws.put(req.getName(), req);
    }

    public static ReqWS findClaim(String name) {
        Assert.notNull(name, "The claim's name must not be null");
        return reqws.get(name);
    }

    public static void main(String[] args) {
        initData();
        System.out.println("Value= " + findClaim("ReqWS"));
    }
}
