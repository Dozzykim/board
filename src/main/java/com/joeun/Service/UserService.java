package com.joeun.Service;

import java.util.List;

import com.joeun.DTO.User;

public interface UserService {

    // 유저 계정유효여부 체크
    List<User> userCheck();
} 
