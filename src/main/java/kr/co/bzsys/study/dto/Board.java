package kr.co.bzsys.study.dto;

import lombok.Data;

@Data
public class Board {
  private String seq;       // 번호
  private String title;     // 제목
  private String writer;    // 작성자
  private String content;   // 내용
  private String regDate;   // 등록 일자
  private String cnt;       // 조회수

}
