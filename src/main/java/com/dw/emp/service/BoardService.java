package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoard(){
		return boardMapper.selectBoard();
	}

	public int insertBoard(BoardVO vo) {
		return boardMapper.insertBoard(vo);
	}
	public BoardVO selectBoardFindByBoardNo(int boardNo) {
		return boardMapper.selectBoardFindByBoardNo(boardNo);
	}
	
	public int deleteBoard(int boardNo) {
		return boardMapper.deleteBoard(boardNo);
	}

	public int updateBoard(BoardVO boardNo) {
		return boardMapper.updateBoard(boardNo);
	}
}
