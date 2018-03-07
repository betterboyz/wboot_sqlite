package com.wboot.system.service;


import com.wboot.system.model.User;

import java.util.List;

/**
 * @author dsz
 * @date 18/03/02
 */
public interface TestService {
  int updateUser(User user);

  List<User> getUserByList(List list);

  List<User> getAllUser();

  List<User> getAllUserLike(String name);

}
