package com.wboot.system.service.impl;

import com.wboot.system.dao.UserMapper;
import com.wboot.system.model.User;
import com.wboot.system.model.UserExample;
import com.wboot.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dsz
 * @date 18/02/09
 */
@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public int addUser(User user) {
    return userMapper.insertSelective(user);
  }

  @Override
  public List<User> getUserList(int start, int length) {
    return userMapper.selectByExample(new UserExample());
  }
}
