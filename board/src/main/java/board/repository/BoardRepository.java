package board.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import board.model.Board;


public interface BoardRepository extends CrudRepository<Board, Long>{
	
	public Board findById(Long id); 
	public List<Board> findAll();
}
