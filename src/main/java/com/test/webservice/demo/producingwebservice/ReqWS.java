package com.test.webservice.demo.producingwebservice;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqWS {
    @NotBlank
    private String notifyno;
    @NotBlank
    private String claimno;

    public String getName() {
        return this.getClass().getSimpleName();
    }

}
