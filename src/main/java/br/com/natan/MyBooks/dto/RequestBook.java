package br.com.natan.MyBooks.dto;

import br.com.natan.MyBooks.model.Book;

public class RequestBook {
	private String titleBook;
	private String publisherBook;
	private String yearReleased;
	private String descriptionBook;
	private String url_Cover;

	public Book toBook() {
		Book book = new Book();
		
		book.setTitle(titleBook);
		book.setDescription(descriptionBook);
		book.setPublisher(publisherBook);
		book.setUrlCover(descriptionBook);
		book.setYear(yearReleased);
		book.setUrlCover(url_Cover);
		
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

	public String getUrl_Cover() {
		return url_Cover;
	}

	public void setUrl_Cover(String url_Cover) {
		this.url_Cover = url_Cover;
	}

}
