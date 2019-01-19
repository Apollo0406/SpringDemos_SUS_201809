package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ApiController {
    @PostMapping(value = "/hello")
    public HashMap<String,  Object> get(@RequestParam String name){
        HashMap<String,Object> map = new HashMap<>();
        map.put("action","hello");
        map.put("name",name);
        return map;
    }
}
