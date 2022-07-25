package kr.co.bzsys.study.controller;

import java.util.List;
import kr.co.bzsys.study.dto.Board;
import kr.co.bzsys.study.mapper.BoardMapper;
import kr.co.bzsys.study.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

  @Autowired
  BoardMapper boardMapper;

  @Autowired
  BoardService boardService;

  @GetMapping("/test")
  public List<Board> creatArticle() {

    return boardService.selectBoard();
  }

}
