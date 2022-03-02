package br.com.natan.MyBooks.dto;

import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.model.BookStatus;

public class RequestBook {
	private String idBook;
	private String titleBook;
	private String publisherBook;
	private String yearReleased;
	private String descriptionBook;
	private String urlCover;
	private String selectStatus;

	public Book toBook() {
		Book book = new Book();
		
		book.setTitle(titleBook);
		book.setDescription(descriptionBook);
		book.setPublisher(publisherBook);
		book.setUrlCover(descriptionBook);
		book.setYear(yearReleased);
		book.setUrlCover(urlCover);
		book.setStatus(BookStatus.valueOf(this.getSelectStatus()));
		
		return book;
	}

	public String getTitleBook() {
		return titleBook;
	}

	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}

	public String getPublisherBook() {
		return publisherBook;
	}

	public void setPublisherBook(String publisherBook) {
		this.publisherBook = publisherBook;
	}

	public String getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}

	public String getDescriptionBook() {
		return descriptionBook;
	}

	public void setDescriptionBook(String descriptionBook) {
		this.descriptionBook = descriptionBook;
	}

	public String getUrlCover() {
		return urlCover;
	}

	public void setUrlCover(String url_Cover) {
		this.urlCover = url_Cover;
	}

	public String getSelectStatus() {
		return selectStatus;
	}

	public void setSelectStatus(String select_status) {
		this.selectStatus = select_status;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

}
