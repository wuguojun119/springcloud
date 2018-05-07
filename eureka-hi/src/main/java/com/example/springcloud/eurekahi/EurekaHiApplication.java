package com.example.springcloud.eurekahi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuguojun
 */
@SpringBootApplication
@RestController
public class EurekaHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHiApplication.class, args);
    }


    @Value("${server.port}")
    String port;

    @RequestMapping("/hi/{name}")
    public String home(@PathVariable String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
