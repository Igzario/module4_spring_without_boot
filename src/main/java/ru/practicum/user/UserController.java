package ru.practicum.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userService = new UserServiceImpl();

    @GetMapping("/users")
    public List<User> userTake() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    public ResponseEntity userGive(@Valid @RequestBody User user) {
        return userService.userPost(user);
    }

    @PutMapping("/users")
    public ResponseEntity userUpdate(@Valid @RequestBody User user) {
        return userService.userPut(user);
    }
}