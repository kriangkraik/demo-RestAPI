package com.test.webservice.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.test.webservice.demo.Model.ReqData;
import com.test.webservice.demo.Services.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class UserController {
    @Autowired
    UserService userservice;

    @RequestMapping(value = "registeruser", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Map<String, Object>> register(@Valid @RequestBody ReqData reqbody) {
        try {
            UserService.addUser(reqbody);
            return ResponseEntity.status(HttpStatus.valueOf(201)).body(Map.of(
                    "statuscode", 201,
                    "message", "add User Complete",
                    "date", "24/12/2022 14:14:50"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.valueOf(500)).body(Map.of(
                    "statuscode", 500,
                    "message", "cannot addUser",
                    "date", "24/12/2022 14:14:50"));
        }

    }
}
