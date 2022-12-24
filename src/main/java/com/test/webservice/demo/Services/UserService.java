package com.test.webservice.demo.Services;

import org.springframework.stereotype.Service;

import com.test.webservice.demo.Model.ReqData;

@Service
public class UserService {
    public static void addUser(ReqData reqbody) {
        System.out.println("Call Add User Method");
        System.out.println(reqbody.getAge());
    }
}
