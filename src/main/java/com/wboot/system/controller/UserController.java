package com.wboot.system.controller;

import com.wboot.system.model.User;
import com.wboot.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author dsz
 * @date 18/02/09
 */
@Controller
@RequestMapping("/user")
public class UserController {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private UserService userService;

  @GetMapping({"/", ""})
  String index() {
    return "index";
  }

  @ResponseBody
  @PostMapping("/add")
  public int addUser(User user) {
    return userService.addUser(user);
  }

  @ResponseBody
  @RequestMapping("/getUser/{start}/{length}")
  public Object getUserList(@PathVariable("start") int start, @PathVariable("length") int length) {

    System.out.println("start:" + start);
    System.out.println("length:" + length);
    return userService.getUserList(start, length);
  }
}
