package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.model.Board;
import board.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	BoardRepository boardRepository;

	public List<Board> boardList() {
		return boardRepository.findAll();
	}

	public void addBoard(Board board) {
		boardRepository.save(board);
	}

	public Board getArticle(long id) {
		return boardRepository.findById(id);
	}

	public void delete(long id) {
		boardRepository.delete(id);
	}
	public void modify(Board board){
		boardRepository.save(board);
	}

}
