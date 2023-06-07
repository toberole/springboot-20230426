package com.zw.controller;

import com.zw.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  public UserService service;
  @GetMapping("/test")
  public void add() {
    System.out.println("add ......");
  }
}
