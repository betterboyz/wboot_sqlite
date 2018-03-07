package com.wboot.system.controller;

import com.google.gson.Gson;
import com.wboot.system.model.User;
import com.wboot.system.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dsz
 * @date 18/03/02
 */
@Controller
@RequestMapping("/test")
public class TestController {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  Gson gson = new Gson();

  @Autowired
  private TestService testService;

  @ResponseBody
  @RequestMapping("/getUserByList")
  public Object getUserByList() {
    List<User> list = new ArrayList<>();
    User user1 = new User();
    user1.setId(1);
    User user2 = new User();
    user2.setId(2);
    User user3 = new User();
    user3.setId(3);
    list.add(user1);
    list.add(user2);
    list.add(user3);
    return testService.getUserByList(list);
  }

//  @InitBinder("user1")
//  public void initBinder1(WebDataBinder binder) {
//    binder.setFieldDefaultPrefix("user1.");
//  }
//
//  @InitBinder("user2")
//  public void initBinder2(WebDataBinder binder) {
//    binder.setFieldDefaultPrefix("user2.");
//  }

  @ResponseBody
  @RequestMapping("/updateUser")
  public int updateUser(User user, String string) {
    System.out.println("user1:" + gson.toJson(user));
    System.out.println("string:" + string);

    return testService.updateUser(user);
  }

  @ResponseBody
  @RequestMapping("/getAllUser")
  public List getAllUser() {
    return testService.getAllUser();

  }

  @ResponseBody
  @RequestMapping("/getAllUserLike")
  public List getAllUserLike(String name) {
    return testService.getAllUserLike(name);

  }

}
