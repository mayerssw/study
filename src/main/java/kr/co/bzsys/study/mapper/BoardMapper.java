package kr.co.bzsys.study.mapper;

import java.util.List;
import kr.co.bzsys.study.dto.Board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

  List<Board> selectBoard();

}
