package com.yerim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러라고 지정,,,
public class MainController {

    @GetMapping("/hello") // GET http://localhost:8080/hello 왔을 때 이 메소드를 실행해주겠다.
    public String hello() {
        return "hello";
    }
}
