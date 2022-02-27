package br.com.natan.MyBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.service.CrudBookService;

@Controller
public class HomeController {
	
	private final CrudBookService bookService;
	
	public HomeController(CrudBookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Iterable<Book> books = this.bookService.viewBooks();
		
		model.addAttribute("books", books);
		return "home";
	}
}
