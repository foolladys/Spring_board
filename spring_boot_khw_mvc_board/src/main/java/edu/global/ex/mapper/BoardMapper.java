package edu.global.ex.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;
import java.util.List;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList(); //목록보기
	BoardVO read(int bid);
	public void insert(BoardVO boardVO); //글쓰기
	public void content_view(int bid); // 글보기
	public int delete(BoardVO boardVO); // 글삭제
	public void hitup(int bid); // 글 조회수 늘리기
	
	// 답글 관련
	public void updateShape(BoardVO boardVO); // 답글위치
	public void insertReply(BoardVO boardVO); // 답글 등록
	
	//paging 관련
	public List<BoardVO> getListWithPaging(Criteria cri);
	public int getTotalCount();
}
