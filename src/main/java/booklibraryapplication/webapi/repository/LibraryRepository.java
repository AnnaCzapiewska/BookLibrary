package booklibraryapplication.webapi.repository;


import booklibraryapplication.webapi.domain.Book;
import booklibraryapplication.webapi.domain.Library;

import java.util.List;

public interface LibraryRepository  {
    Library getAllBooks();
    List<Book> getCategory(String searchCategory);
    Book getIsbn(String isbn);

}
