package ru.practicum.user;
import lombok.Data;
import javax.validation.constraints.*;

@Data
public class User {
    private Long id;
    private String name;
    @NotEmpty(message = "Ошибка ввода - Email: null или empty")
    @Email(message = "Ошибка ввода - Email: not email format")
    private final String email;
}