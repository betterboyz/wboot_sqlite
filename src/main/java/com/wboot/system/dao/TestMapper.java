package com.wboot.system.dao;

import com.wboot.system.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author dsz
 * @date 18/02/28
 */
public interface TestMapper {
  //  @Results({@Result(property = "id", column = "id")})
  @Select("select * from user where id = #{id}")
  List<User> getUserById(@Param("id") long id);

  @SelectProvider(type = TestMapperProviser.class, method = "getUserByList")
  List<User> getUserByList(@Param("userList") List<User> list);

  @Update("update user set name = #{name}, age = #{age}, sex = #{sex} where id = #{id}")
  int updateUser(User user);

  @Select("select * from user")
  List<User> getAllUser();

  @Select("select * from user where name like '%${name}%'")
  List<User> getAllInfoLike(@Param("name") String name);

//  @Insert("insert into demx_taskbasic (taskId, taskName, description, taskTypeId, status, createTime, imagePath, taskOrder) values (#{taskid}, #{taskname}, #{description},  #{tasktypeid}, #{status}, #{createtimeD}, #{imagepath}, #{taskorder})")
//  int addTaskbasic(TaskBasic taskbasic);
//
//  @Select("select *,createTime as createtimeD from demx_taskbasic")
//  List<TaskBasic> getTaskBasic();
}
