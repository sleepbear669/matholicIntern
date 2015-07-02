package board.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Board {	
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String writer;
	private String article;
	private String img;

	public Board(){}
	
	public Board( String title, String writer, String article) {
		this.title = title;
		this.writer = writer;
		this.article = article;
	}
	
	
	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getWriter() {
		return writer;
	}


	public String getArticle() {
		return article;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
	
}
