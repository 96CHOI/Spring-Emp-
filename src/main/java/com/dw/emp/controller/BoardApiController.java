package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoardVO;
import com.dw.emp.vo.EmpVO;


@RestController
public class BoardApiController {
	@Autowired
	BoardService boardService;
	
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardService.selectBoard();
	}
	
	@PostMapping("/api/v1/board")
	public int callBoardSave(@RequestBody BoardVO vo) {
		
		return boardService.insertBoard(vo);
	}
	@GetMapping("/api/v1/board/{boardNo}")
	public BoardVO callBoard(@PathVariable int boardNo) {
		return boardService.selectBoardFindByBoardNo(boardNo);
	}
	//삭제
	@DeleteMapping("/api/v1/board/{boardNo}")
	public int callEmpDelete(@PathVariable int boardNo) {
		return boardService.deleteBoard(boardNo);
	}
	//수정
	@PatchMapping("/api/v1/board")
	public int callEmpUpdate(@RequestBody BoardVO boardNo) {
		return boardService.updateBoard(boardNo);
	}
}
