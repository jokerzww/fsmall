package com.fsteam.fsmall.controller;

import com.fsteam.fsmall.dto.MallDetail;
import com.fsteam.fsmall.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private MallService mallservice;

    @GetMapping("/mall_list")
    @ResponseBody
    public List<MallDetail> getAllMall() {
        return mallservice.getAllMall();
    }



}
