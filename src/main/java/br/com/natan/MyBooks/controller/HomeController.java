package br.com.natan.MyBooks.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.natan.MyBooks.model.Book;
import br.com.natan.MyBooks.model.BookStatus;
import br.com.natan.MyBooks.service.CrudBookService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	private final CrudBookService bookService;
	
	public HomeController(CrudBookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public String home(Model model) {
		Iterable<Book> books = this.bookService.viewBooks();
		
		model.addAttribute("books", books);
		return "home";
	}
	
	@GetMapping("/remove")
	public String removeBookFromPage(@ModelAttribute("id") String id) {
		Long idBook = Long.parseLong(id);
		this.bookService.removeBook(idBook);	
		return "redirect:/home";
	}
	
	@GetMapping("/{status}")
	public String statusBook(@PathVariable("status") String status, Model model) {
		List<Book> books = this.bookService.findBookStatus(BookStatus.valueOf(status.toUpperCase()));
		
		model.addAttribute("books", books);
		model.addAttribute("status", status);
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
