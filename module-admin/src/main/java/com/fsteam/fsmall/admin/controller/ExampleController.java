package com.fsteam.fsmall.admin.controller;

import com.fsteam.fsmall.admin.dto.ExampleTest;
import com.fsteam.fsmall.admin.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Example")
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String exampleTest(@RequestBody ExampleTest test){
        return exampleService.getMallName(test.getId());
    }
}
