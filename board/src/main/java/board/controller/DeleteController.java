package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import board.service.BoardService;

@Controller
public class DeleteController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/delete/{id}")
	public String baordDelete(@PathVariable long id){
		boardService.delete(id);
		return "redirect:/angularBoard/board.html";
	}

}
