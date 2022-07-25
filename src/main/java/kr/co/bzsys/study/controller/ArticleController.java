package kr.co.bzsys.study.controller;

import java.util.List;
import kr.co.bzsys.study.dto.Board;
import kr.co.bzsys.study.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

  @Autowired
  BoardMapper boardMapper;

  @GetMapping("/create")
  public List<Board> creatArticle() {
    return boardMapper.selectBoard();
  }

}
