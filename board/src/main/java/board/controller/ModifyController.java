package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.model.Board;
import board.service.BoardService;

@Controller
public class ModifyController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board/modifyController", method=RequestMethod.GET)
	public String modify(Board board){
		boardService.modify(board);
		return "redirect:/angularBoard/board.html";
	}
}
