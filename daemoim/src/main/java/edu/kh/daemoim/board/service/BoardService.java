package edu.kh.daemoim.board.service;

import java.util.List;
import java.util.Map;

import edu.kh.daemoim.board.dto.Board;

public interface BoardService {

	/** 게시글 목록 조회
	 * @param groupNo
	 * @param boardTypeCode
	 * @param cp
	 * @return
	 */
	Map<String, Object> selectBoardList(int groupNo, int boardTypeCode, int cp);

	/** 검색 목록 조회
	 * @param groupNo
	 * @param boardTypeCode
	 * @param cp
	 * @param paramMap
	 * @return
	 */
	Map<String, Object> selectSearchList(int groupNo, int boardTypeCode, int cp, Map<String, Object> paramMap);

	/** 게시글 상세 조회
	 * @param map
	 * @return
	 */
	Board selectDetail(Map<String, Integer> map);

	/** 조회수 1 증가
	 * @param boardNo
	 * @return
	 */
	int updateReadCount(int boardNo);

	/** DB에서 모든 게시판 종류를 조회
	 * @return
	 */
	List<Map<String, String>> selectBoardTypeList();

}
