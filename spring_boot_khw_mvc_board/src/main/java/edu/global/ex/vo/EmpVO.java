package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmpVO {

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal; 
	private int comm;
	private int deptno;
	
}
