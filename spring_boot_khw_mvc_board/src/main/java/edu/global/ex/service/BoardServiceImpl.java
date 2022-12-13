package edu.global.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList() ...");
		
		return boardMapper.getList();
	}

	@Override
	public void register(BoardVO boardVO) {
		
		log.info("register().. ");
		boardMapper.insert(boardVO);
	}
	
	@Override
	public void content_view(BoardVO boardVO) {
		
		int bid = boardVO.getBid();
		
		log.info("content_view() .. ");
		boardMapper.content_view(bid);
	}

	@Override
	public BoardVO read(int bid) {
		log.info("read() ..");
		
		System.out.println(boardMapper.read(bid));
		
		return boardMapper.read(bid);
	
	}

	@Override
	public int remove(BoardVO boardVO) {
		log.info("remove() ..");
		return boardMapper.delete(boardVO);

	}

	@Override
	public void hitup(int bid) {
		
		log.info("hitup() ..");
		boardMapper.hitup(bid);
		
	}

	@Transactional
	@Override
	public void registerReply(BoardVO boardVO) {

		log.info("답글이 작성되었습니다.");
		
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("getList (Criteria cri) ...");
		return boardMapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal() {
		log.info("getTotal() .."); 
		return boardMapper.getTotalCount();
	}

	
}
