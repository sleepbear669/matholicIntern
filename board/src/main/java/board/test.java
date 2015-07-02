package board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import board.controller.BoardController;
import board.controller.BoardPageController;
import board.controller.ModifyController;
import board.controller.WriteController;
import board.model.Board;

@SpringBootApplication
public class test implements CommandLineRunner{

	
	@Autowired
	BoardController boardController;
	@Autowired
	BoardPageController boardPageController;
	@Autowired
	ModifyController modifyController;
	@Autowired
	WriteController writeController;
	
	public static void main(String args[]){
		SpringApplication.run(test.class);
	    
	}
	public void run(String... strings) throws Exception {
//		Board board1 = new Board("title", "gom", "123");
//		Board board2 = new Board("title2", "gom1", "1234");
//		writeController.write(board, upload)(board1);
//		writeController.write(board2);
//		
//		List<Board> list = boardController.boardPage();
//		for( Board board : list){
//			System.out.println(board.toString());
//		}
//		Board getBoard = boardPageController.boardPage(1);
//		System.out.println(getBoard.toString());
//		
//		Board newBoard = new Board(getBoard.getTitle(), getBoard.getWriter(), "gomgom");
//		modifyController.modify(newBoard);
//		
//		Board modifiedBoard = boardPageController.boardPage(1);
//		System.out.println(modifiedBoard);
//		
//		list = boardController.boardPage();
//		for( Board board : list){
//			System.out.println(board.toString());
//		}
    }

}
