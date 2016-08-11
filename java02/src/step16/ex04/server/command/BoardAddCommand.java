package step16.ex04.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import step16.ex04.server.BoardDao;
import step16.ex04.server.Command;
import step16.ex04.vo.Board;

@Component("/board/add.do")
public class BoardAddCommand implements Command {
  @Autowired BoardDao boardDao;
  
  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    Board board = new Board();
    board.setPassword(paramMap.get("password"));
    board.setTitle(paramMap.get("title"));
    board.setContents(paramMap.get("contents"));
    
    out.writeObject(boardDao.insert(board));
  }
}








