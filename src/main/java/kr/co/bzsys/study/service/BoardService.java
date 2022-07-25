package kr.co.bzsys.study.service;

import java.util.List;
import kr.co.bzsys.study.dto.Board;
import org.springframework.stereotype.Repository;

public interface BoardService {

  List<Board> selectBoard();

}
