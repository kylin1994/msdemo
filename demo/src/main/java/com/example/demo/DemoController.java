package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String getMsg() {
        return new RestTemplate().getForEntity("http://hello-service:18081/msg", String.class).getBody();
    }

}
