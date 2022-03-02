package br.com.natan.MyBooks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.model.BookStatus;
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

	public List<Book> findBookStatus(BookStatus status) {
		return this.bookRepository.findByStatus(status);
	}
	
	public void removeBook(Long id) {
		this.bookRepository.deleteById(id);
	}

	public Book findBookById(Long id) {
		return this.bookRepository.findById(id).get();
	}
}
