package br.com.natan.MyBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.natan.MyBooks.dto.RequestBook;
import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.service.CrudBookService;

@Controller
public class FormController {
	private final CrudBookService bookService;

	public FormController(CrudBookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/form")
	public String form(RequestBook request) {
		return "form";
	}

	@PostMapping("new")
	public String newBook(RequestBook request) {
		Book book = new Book();

		book = request.toBook();
		this.bookService.saveBook(book);

		return "home";
	}
}
