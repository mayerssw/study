package kr.co.bzsys.study.controller.join;

import java.util.List;
import kr.co.bzsys.study.dto.board.Board;
import kr.co.bzsys.study.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class InsertJoinController {

  @Autowired
  BoardService boardService;

  @RequestMapping(value = "/join")
  public String moveJoin(Model model) {

    List<Board> boardList = boardService.selectBoard();
    String seq = boardList.get(0).getSeq();
    model.addAttribute("seq", seq);

    System.out.println("★★★seq" + seq);
    return "/join/insertJoin";
  }

}
