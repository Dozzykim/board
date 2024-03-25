package com.joeun.DAO;

import java.util.ArrayList;
import java.util.List;

import com.joeun.DTO.User;

/**
 *  데이터 접근 객체
 *  - 유저 데이터 접근
 */

public class UserDAO extends JDBConnection {
    // 유저 계정유효 여부 체크
    public List<User> checkAccount() {

        // 유저 목록을 담을 컬렉션 객체 생성
        List<User> userList = new ArrayList<User>();

        // SQL 작성
        String sql = " SELECT * " + " FROM users ";
        
        try {
            // 쿼리(SQL) 실행 객체 생성 - Statement (stmt)
            stmt = con.createStatement();
            
            // 쿼리(SQL) 실행 결과를 받아오는 객체 생성 - ResultSet (rs)
            rs = stmt.executeQuery(sql);

            // 조회 결과를 리스트(userList)에 추가
            boolean IsExist = true;
            while (IsExist) {
                // rs.get으로 가져온... 데이터 일일히 ... 보드객체
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        return null;
    }

    
}
