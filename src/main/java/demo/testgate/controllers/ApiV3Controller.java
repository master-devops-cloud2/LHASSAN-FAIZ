package demo.testgate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiV3Controller {

    @GetMapping("/hello")
    public String helloV1() {
        return "Hello from API version 3!";
    }
}
