package com.springvalidation.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class RegistrationDto {

    private Long id;

    @NotEmpty(message = "first name is required")
    private String firstName;

    @NotEmpty(message = "last name is required")
    private String lastName;

    @NotEmpty(message = "city is required")
    private String city;

    @Email(message = "enter valid email")
    @NotEmpty(message = "email is required")
    private String email;

    @NotBlank(message = "mobile is required")
    @Pattern(regexp = "\\d{10}", message = "Enter valid mobile number")
    private String mobile;
}
