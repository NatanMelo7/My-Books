package br.com.natan.MyBooks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.natan.MyBooks.model.Book;

@Repository	
public interface BookRepository extends CrudRepository<Book, Long> {
	
}
