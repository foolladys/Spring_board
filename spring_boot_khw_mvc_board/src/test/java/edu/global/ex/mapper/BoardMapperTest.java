package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.BoardVO;

@SpringBootTest
class BoardMapperTest {

	@Autowired
	
	//주입
	private BoardMapper boardMapper;
	
	@Test
	void testList() {

		System.out.println(boardMapper);
		
		List<BoardVO> boards = boardMapper.getList();
	
		for(BoardVO board : boards) {
			System.out.println(board);
		}
	}
	
	@Test
	void testRead() {

		BoardVO boards2 = boardMapper.read(19);
		
		System.out.println(boards2);
		
		}
		
	}

