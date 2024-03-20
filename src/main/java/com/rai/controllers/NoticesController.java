package com.rai.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notice")
    public String getAccountDetails(){
        return "Notification from myAccount";
    }
}
