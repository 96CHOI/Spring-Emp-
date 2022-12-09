package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {
	/**
	 * @Since : 2022. 12. 7.
	 * @Author : mr.Choi
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회
	 */
	List<EmpVO> selectEmp();
	
	public EmpVO selectEmpfindByEmpno(int empno);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : mr.Choi
	 * @Return : List<EmpVO>
	 * @Comment : 사원 추가
	 */
	
	int insertEMP(EmpVO vo);

	int updateEMP(EmpVO emp);

	int deleteEmp(int empno);
}
