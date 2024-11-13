package programmers.test.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import programmers.test.domain.user.dto.request.UserRequestDto;
import programmers.test.domain.user.dto.response.UserResponseDto;
import programmers.test.domain.user.service.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public String saveUser(@RequestBody UserRequestDto userRequestDto) {
        userService.saveUser(userRequestDto);
        return "ok";
    }

    @GetMapping("/{userId}")
    public UserResponseDto getUser(@PathVariable Long userId) {
        UserResponseDto userInfo = userService.getUser(userId);
        return userInfo;
    }

}
