package com.wboot.system.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wboot.system.dao.TestMapper;
import com.wboot.system.model.User;
import com.wboot.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dsz
 * @date 18/03/02
 */
@Service("testService")
public class TestServiceImpl implements TestService {
  private Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setDateFormat("yyyy-MM-dd HH:mm:ss:SSS").disableHtmlEscaping().create();
  @Autowired
  private TestMapper testMapper;

  @Override
  public int updateUser(User user) {
    return testMapper.updateUser(user);
  }

  @Override
  public List<User> getUserByList(List list) {
    List<User> userList = testMapper.getUserByList(list);
    return userList;
  }

  @Override
  public List<User> getAllUser() {
    return testMapper.getAllUser();
  }

  @Override
  public List<User> getAllUserLike(String name) {
    return testMapper.getAllInfoLike(name);
  }



}
