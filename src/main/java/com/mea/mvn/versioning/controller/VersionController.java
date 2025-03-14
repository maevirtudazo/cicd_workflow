package com.mea.mvn.versioning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class VersionController {

    @Value("${app.version:1.0.0}")
    private String appVersion;

    @GetMapping("/version")
    public String getVersion() {
        return "Current version: " + appVersion;
    }
}