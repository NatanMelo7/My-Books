package br.com.natan.MyBooks.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.model.BookStatus;

@Repository	
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByStatus(BookStatus status);
	
}
