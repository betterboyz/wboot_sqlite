package com.wboot.system.dao;

import com.wboot.system.model.User;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

/**
 * @author dsz
 * @date 18/03/02
 */
public class TestMapperProviser {
  public String getUserByList(Map map) {
    List<User> userList = (List<User>) map.get("userList");
    StringBuilder sb = new StringBuilder();
    sb.append("select * from user where id in(");

    MessageFormat mf = new MessageFormat("#'{'userList[{0}].id}");
    int size = userList.size();

    for (int i = 0; i < size; i++) {
      sb.append(mf.format(new Object[]{i}));
      if (i < size - 1) {
        sb.append(",");
      }
    }
    sb.append(")");
    System.out.println(sb.toString());
    return sb.toString();
  }
}
