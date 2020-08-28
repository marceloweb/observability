package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Default {

  @GetMapping("/")
  public String index() {
    return "Hello world!";
  }

}