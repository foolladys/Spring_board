package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> getList();

	public void register(BoardVO boardVO);
	public void content_view(BoardVO boardVO);
	BoardVO read(int bid); // 글보기 메소드

	int remove(BoardVO boardVO);
	public void hitup(int bid);
	public void registerReply(BoardVO boardVO);

	public List<BoardVO> getList(Criteria cri);

	public int getTotal();

	
}
