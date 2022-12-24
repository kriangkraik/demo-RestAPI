package com.test.webservice.demo.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ReqData {
    @NotBlank(message = "Name is NotBlank")
    private String fnameTH;

    @Positive(message = "Age can't less then 0")
    @Min(value = 1, message = "Age can't equal or less than 0")
    private int age;
}
