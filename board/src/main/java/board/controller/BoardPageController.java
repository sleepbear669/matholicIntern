package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import board.model.Board;
import board.service.BoardService;


@Controller
@RequestMapping
public class BoardPageController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board/page/{id}")
	@ResponseBody
	public Board boardPage(@PathVariable("id") long id){
		return boardService.getArticle(id);
	}
}

