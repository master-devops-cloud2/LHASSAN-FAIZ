package demo.testgate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiV1Controller {

    @GetMapping("/hello")
    public String helloV1() {
        System.out.println("testetstesttetstetstetstetstettestetstestttestetste");
        return "Hello from API version 1!";
    }
}
