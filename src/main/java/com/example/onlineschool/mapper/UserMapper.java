package com.example.onlineschool.mapper;

import com.example.onlineschool.model.Student;
import com.example.onlineschool.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE email=#{email}")
    User findByEmail(String email);

    @Insert("INSERT INTO users(email, first_name, last_name, password, role, status) " +
            "VALUES(#{email}, #{firstName}, #{lastName}, #{password}, #{role}, #{status})")
    void create(User user);
}
