package br.com.natan.MyBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.natan.MyBooks.dto.RequestBook;
import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.service.CrudBookService;

@Controller
@RequestMapping("/form")
public class FormsController {
	private final CrudBookService bookService;

	public FormsController(CrudBookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/new")
	public String form(RequestBook request) {
		return "forms/form";
	}

	@PostMapping("new")
	public String newBook(RequestBook request) {
		Book book = new Book();

		book = request.toBook();
		this.bookService.saveBook(book);

		return "redirect:/home";
	}
}
