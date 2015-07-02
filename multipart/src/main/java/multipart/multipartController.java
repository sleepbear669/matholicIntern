package multipart;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class multipartController {

	@RequestMapping(value="/multipart", method=RequestMethod.POST)
	public String fileUpload(@RequestParam(value="fileUpload") MultipartFile fileUpload) throws IOException{
		String fileName = fileUpload.getOriginalFilename();
		String fileDirect = "src/main/webapp/resources/file";
		String filePath = Paths.get(fileDirect, fileName).toString();
		
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
		bufferedOutputStream.write(fileUpload.getBytes());
		bufferedOutputStream.close();
		return "redirect:/";
	}
}
