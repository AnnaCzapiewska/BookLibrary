package booklibraryapplication.webapi.service;

import booklibraryapplication.webapi.domain.Book;
import booklibraryapplication.webapi.domain.Library;

import java.util.List;


public interface BookService {

    Library getAllBooks();
    List<Book> getCategory(String searchCategory);
    Book getIsbn(String isbn);
}
