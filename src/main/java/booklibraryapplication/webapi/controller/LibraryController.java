package booklibraryapplication.webapi.controller;

import booklibraryapplication.webapi.domain.Book;
import booklibraryapplication.webapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LibraryController {
    @Autowired
   private BookService bookService;


    @RequestMapping
    public String list(){
        return  bookService.getAllBooks().toString();
    }
    @RequestMapping("/category/{categories}")
    public List<Book> getBookByCategory(@PathVariable ("categories") String categories) {
        return bookService.getCategory(categories);
    }
    @RequestMapping("/isbn/{identifier}")
    public Book getBookByIsbn(@PathVariable ("identifier")  String identifier) {
        return bookService.getIsbn(identifier);

    }

}
