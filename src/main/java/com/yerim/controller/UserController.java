package com.yerim.controller;

import com.yerim.service.UserService;
import com.yerim.service.dto.SignUpRequest;
import com.yerim.service.dto.UserInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/api/v1/users")
    public String signup(@RequestBody SignUpRequest request) {  //TODO DTO 객체로 받아야한다. -> 만
        userService.signUp(request.getEmail(), request.getName(), request.getPassword());
        return "ok!";
    }

    @GetMapping("/api/v1/users/{userId}")
    public UserInfoResponse getUserInfo(@PathVariable Long userId) {
        return userService.getUser(userId);
    }
}
