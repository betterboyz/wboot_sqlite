package com.wboot.system.service;

import com.wboot.system.model.User;

import java.util.List;

/**
 * @author dsz
 * @date 18/02/09
 */
public interface UserService {
  int addUser(User user);

  List<User> getUserList(int start, int length);
}
