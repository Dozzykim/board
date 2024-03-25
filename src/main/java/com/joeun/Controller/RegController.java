package com.joeun.Controller;

import com.joeun.DTO.User;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegController {


    @FXML
    private TextField tId;

    @FXML
    private PasswordField tPw;

    private User user = new User();

}
