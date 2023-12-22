package com.myapp.controllers;

import com.myapp.services.MyService;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleController {

    private final MyService myService;

    @Autowired
    public SampleController(MyService myService) {
        this.myService = myService;
    }

    // Controller logic goes here...
}
