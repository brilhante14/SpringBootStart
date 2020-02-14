package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

import com.example.demo.persistence.model.BookBusiness;
import com.example.demo.persistence.model.Book;

@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;

        @RequestMapping("/")
        public String homePage(Model model) {
                model.addAttribute("appName", appName);
                return "home";
        }

	@RequestMapping("/list_book")
	public String listBook(Model model) {
		
		BookBusiness business = new BookBusiness();
		List<Book> bookList = business.getBookList();
		
		model.addAttribute("books", bookList);

		return "book";
	}
}
