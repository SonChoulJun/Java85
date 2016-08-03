package step15.ex02.server.command;

import java.io.ObjectOutputStream;
import java.util.Map;

import step15.ex02.server.BoardDao;
import step15.ex02.server.Command;

public class BoardListCommand implements Command {
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectOutputStream out, Map<String, String> paramMap) throws Exception {
    int pageNo = 1;
    int length = 5;
    
    if (paramMap.get("pageNo") != null) {
      pageNo = Integer.parseInt(paramMap.get("pageNo"));
    }
    
    if (paramMap.get("length") != null) {
      length = Integer.parseInt(paramMap.get("length"));
    }
    out.writeObject(boardDao.selectList(pageNo, length));
  }
}








