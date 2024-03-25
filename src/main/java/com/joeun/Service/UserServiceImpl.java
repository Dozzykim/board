package com.joeun.Service;

import java.util.List;

import com.joeun.DTO.User;

public class UserServiceImpl implements UserService{

    @Override
    public List<User> userCheck() {
         
        // 1. DAO 객체에 유저 목록 요청
        List<User> userList = userDAO.list();

        // 2. 유저 목록 중, 입력된 데이터와 일치 여부 체크

        // 3. 로그인 유효성 결과 반환
        

        return null;
    }
    
}
