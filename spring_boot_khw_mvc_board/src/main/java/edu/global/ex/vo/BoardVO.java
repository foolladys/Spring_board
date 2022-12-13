package edu.global.ex.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//디버깅할때 파라미터값 순서대로 뿌려주는 역할을 한다.
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BoardVO {

	private int bid;
	private String bname;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private int bhit;
	private int bgroup;
	private int bstep;
	private int bindent;
	
}
