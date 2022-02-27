package br.com.natan.MyBooks.service;

import org.springframework.stereotype.Service;

import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.repository.BookRepository;

@Service
public class CrudBookService {
	private final BookRepository bookRepository;
	
	public CrudBookService(BookRepository repository) {
		this.bookRepository = repository;
	}
	
	public void saveBook(Book book) {
		this.bookRepository.save(book);
	}
	
	public Iterable<Book> viewBooks() {
		return this.bookRepository.findAll();
	}
}
