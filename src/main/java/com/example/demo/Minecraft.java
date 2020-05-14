package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Minecraft {

    // GET, PUT, POST, DELETE

    @RequestMapping("api/hello-world")
    @GetMapping
    public List<String> getMinecraft() {
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        return list;

    }


}

