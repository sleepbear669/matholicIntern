package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import board.model.Board;
import board.service.BoardService;


@Controller
@RequestMapping
public class WriteController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="board/writeController", method=RequestMethod.POST)
	public String write(Board board){
		boardService.addBoard(board);
		return "redirect:/angularBoard/board.html";
	}

}
