package com.milan.jenkins01;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyFirstController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello Milan";
    }
}

