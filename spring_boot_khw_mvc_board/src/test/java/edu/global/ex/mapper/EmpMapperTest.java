package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.EmpVO;

@SpringBootTest
class EmpMapperTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Test
	void getEmpLists() {
		
		System.out.println(empMapper);
		
		List<EmpVO> emplists = empMapper.getList();
		
		for(EmpVO emps : emplists) {
			System.out.println(emps);
		}
		
	}

}
