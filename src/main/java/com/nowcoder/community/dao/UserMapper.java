package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public User selectUserById(int id);

    public User selectUserByName(String username);

    public User selectUserByEmail(String email);

    public void insertUser(User user);

}
