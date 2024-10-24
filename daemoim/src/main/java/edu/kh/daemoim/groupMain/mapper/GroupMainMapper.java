package edu.kh.daemoim.groupMain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.daemoim.groupMain.dto.Notice;
import edu.kh.daemoim.groupMain.dto.PhotoBox;

@Mapper
public interface GroupMainMapper {

	// 공지 목록 조회
	List<Notice> getBoardList();

	// 공지사항 목록 불러오기

	List<Notice> selectBoardList();

	// 사진 불러오기

	List<PhotoBox> getPhotos(int groupNo);

}
