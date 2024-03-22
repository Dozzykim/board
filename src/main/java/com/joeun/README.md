# 게시판 프로그램
0. DB 구축
    - 오라클 설치
    - 계정생성
    - 테이블 생성 (board)


1. JavaFx 프로젝트 생성
2. pom.xml - ojdbc 의존성(라이브러리) 추가
    (systemPath는 요령껏 ojdbc9.jar 경로에 맞게)
```
<!-- ojdbc driver -->
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc8</artifactId>
            <version>21.5</version>
            <scope>system</scope>
            <systemPath>D:\DH\SETUP\WINDOWS.X64_193000_db_home\jdbc\lib\ojdbc8.jar</systemPath>
        </dependency>
```

3. module-info.java에 java.sql 모듈 추가 및 opens에 java.sql 추가
```
    requires java.sql;

    opens com.joeun to javafx.fxml, java.sql;
```

4. JDBC 연동 - JDBConnection.java

5. 게시판 프로그램의 Model 재사용
    - (DAO, DTO, Service)

6. View (fxml)
    - 게시글 목록: TableView

7. Controller