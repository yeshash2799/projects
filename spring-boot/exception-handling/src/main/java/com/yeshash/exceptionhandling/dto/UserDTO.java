package com.yeshash.exceptionhandling.dto;

import com.yeshash.exceptionhandling.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotBlank(message = "name should not be blank")
    private String name;

    @NotBlank(message = "email should not be blank")
    @Email(message = "invalid email id")
    private String email;

    @NotBlank(message = "mobile number should not be blank")
    @Pattern(regexp = "^[0-9]{9}$", message = "invalid mobile number")
    private String mobile;

    @NotBlank(message = "gender should not be blank")
    private String gender;

    @Min(value = 18)
    @Max(value = 60)
    private int age;

    @NotBlank(message = "nationality should not be blank")
    private String nationality;

    public User buildUser() {
        User user = User
                .builder()
                .name(this.name)
                .email(this.email)
                .mobile(this.mobile)
                .gender(this.gender)
                .age(this.age)
                .nationality(this.nationality)
                .build();

        return user;
    }
}
