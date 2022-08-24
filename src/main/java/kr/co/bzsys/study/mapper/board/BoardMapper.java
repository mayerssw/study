package kr.co.bzsys.study.mapper.board;

import java.util.List;
import kr.co.bzsys.study.dto.board.Board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

  List<Board> selectBoard();

}
