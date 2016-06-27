/* 역할: 게시물 관리(등록/조회/변경/삭제)*/
package step07.ex08;

import java.util.*;

public class BoardController {
  static Scanner keyScanner;
  
  Board[] boards = new Board[100];
  int i = 0;
  String boardName; 

  public BoardController() {}
  
  public BoardController(String boardName) {
    this.boardName = boardName;
  }
  
  public void service() {
    String command;
    
    label1: while (true) {
      System.out.printf("메인/%s> ", boardName);
      command = keyScanner.nextLine();
      
      switch (command) {
      case "main":
        break label1;
      case "add":
        this.add();
        break;
      case "list":
        this.list();
        break;
      case "detail":
      case "update":
      case "delete":
        System.out.println(command);        
        break;
      default:
        System.out.println("사용할 수 없는 명령입니다.");
      }
    }
  }

  void list() {
    for (int x = 0; x < this.i; x++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
        this.boards[x].no, this.boards[x].title, this.boards[x].writer,
        this.boards[x].createdDate, this.boards[x].viewCount);
    }
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n"))
      return false;
    return true;
  }

  void add() {
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
    
    this.boards[this.i++] = board;
  }
}

/*

*/
