package kr.co.bzsys.study.service;

import java.util.List;
import kr.co.bzsys.study.dto.Board;
import kr.co.bzsys.study.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

  @Autowired
  BoardMapper boardMapper;

  @Override
  public List<Board> selectBoard(){
    return boardMapper.selectBoard();
  }

}
