package board.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import board.model.Board;
import board.service.BoardService;

@Controller
public class ModifyController {

	@Autowired
	BoardService boardService;

	@RequestMapping(value = "/board/modifyController", method = RequestMethod.POST)
	public String modify(
			Board board,
			@RequestParam(value = "upload", required = false) MultipartFile upload)
			throws IOException {
		String fileName = upload.getOriginalFilename();
		if (!fileName.equals("")) {
			String fileDirect = "src/main/webapp/resources/file";
			String filePath = Paths.get(fileDirect, fileName).toString();
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
					new FileOutputStream(new File(filePath)));
			bufferedOutputStream.write(upload.getBytes());
			bufferedOutputStream.close();
		} else {
			Board oldBoard = boardService.getArticle(board.getId());
			fileName = oldBoard.getImg();
		}
		board.setImg(fileName);

		boardService.modify(board);
		return "redirect:/angularBoard/board.html";
	}
}
