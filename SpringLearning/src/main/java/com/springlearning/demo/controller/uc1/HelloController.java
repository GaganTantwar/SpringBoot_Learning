package com.springlearning.demo.controller.uc1;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping({"","/hello"})
    public String sayHello(){
        return "Hello From BirdgeLabz";
    }
}
