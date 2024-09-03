package org.example.quizzappbackend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class PlayerDto {

        @NotBlank(message = "Email is mandatory")
        @Email(message = "Email should be valid")
        private String email;

}
