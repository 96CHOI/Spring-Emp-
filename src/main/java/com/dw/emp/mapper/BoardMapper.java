package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;
@Mapper
public interface BoardMapper {
	
	
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : mr.Choi
	 * @Return : List<BoardVO>
	 * @Comment : Board 테이블 조회
	 */
	List<BoardVO> selectBoard();
	
	// 작성환 쿼리ID와 메소드이름이 동일해야 매핑(연결)이 된다.
	public int insertBoard(BoardVO vo);
	
	public BoardVO selectBoardFindByBoardNo(int boardNo);

	int deleteBoard(int board);

	int updateBoard(BoardVO boardNo);
}
