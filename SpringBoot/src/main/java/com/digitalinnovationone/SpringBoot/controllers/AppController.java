package com.digitalinnovationone.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("AppController/")
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;
    @GetMapping("/profilemsg")
    public String getAppMessage(){
        return appMessage;
    }
    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
