package com.mea.mvn.versioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VersioningDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VersioningDemoApplication.class, args);
    }
}
