package com.joeun.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.joeun.App;
import com.joeun.DTO.Board;
import com.joeun.Service.BoardService;
import com.joeun.Service.BoardServiceImpl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListController implements Initializable {
    @FXML
	public TableView<Board> boardTableView;
	
	@FXML
	public TableColumn<Board, Integer> colNo;
	@FXML
	public TableColumn<Board, String> colTitle;
	@FXML
	public TableColumn<Board, String> colWriter;
	@FXML
	public TableColumn<Board, String> colRegDate;
	@FXML
	public TableColumn<Board, String> colView;

    static private BoardService boardService = new BoardServiceImpl();


    @FXML
    void moveToInsert(ActionEvent event) throws IOException {
		System.out.println("글쓰기 화면으로 이동합니다.");
        App.setRoot("board/insert"); /* Insert.fxml 화면으로 이동 */
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // 게시글 목록 조회
        List<Board> boardList = boardService.list();

        colNo.setCellValueFactory( new PropertyValueFactory<>("No"));
		colTitle.setCellValueFactory( new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory( new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory( new PropertyValueFactory<>("RegDate"));
		colView.setCellValueFactory( new PropertyValueFactory<>("View"));
		
		// 테이블뷰에 데이터 추가하기
		ObservableList<Board> list = FXCollections.observableArrayList(
            boardList
		);
		
		boardTableView.setItems(list);
    }
}