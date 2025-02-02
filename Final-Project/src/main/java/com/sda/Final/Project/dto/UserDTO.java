package com.sda.Final.Project.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UserDTO {


    private Integer id;
    @NotNull
    @NotEmpty(message = "Name must not be empty")
    @NotBlank(message = "Name must not be blank")
    private String name;
    @NotNull
    @NotEmpty(message = "Surname must not be empty")
    @NotBlank(message = "Surname must not be blank")
    private String surname;

    @NotNull
    @NotEmpty(message = "Email must not be empty")
    @NotBlank(message = "Email must not be blank")
    @Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$",

            message = "Please enter the correct email format")
    private String email;

    @NotNull
    @NotEmpty(message = "Phone number must not be empty")
    @NotBlank(message = "Phone number must not be blank")
    @Pattern(regexp = "^(\\+?\\d{1,3}[-.\\s]?)?(\\(?\\d{1,5}\\)?[-.\\s]?)?(\\d{1,4}[-.\\s]?)?\\d{1,9}$\n",
    message = "Please insert a valid phone number!")
    private String phoneNumber;

    @NotNull
    @NotEmpty(message = "Email must not be empty")
    @NotBlank(message = "Email must not be blank")
    @Pattern(regexp = "^(?=.*[A-Z]).{9,}$",
            message = "Password must be more than 8 characters long and should contain a capital letter!")
    private String password;

    private LocalDate dateCreated;

    private LocalDate dateModified;

    private String location;

    private String feedback;

    private float rating;

    public UserDTO(Integer id) {
        this.id = id;
    }


}
