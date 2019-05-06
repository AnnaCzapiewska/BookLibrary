package booklibraryapplication.webapi.service;

import booklibraryapplication.webapi.domain.Book;
import booklibraryapplication.webapi.domain.Library;
import booklibraryapplication.webapi.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public Library getAllBooks(){
        return libraryRepository.getAllBooks();
    }
    @Override
    public List<Book> getCategory(String searchCategory){
        return libraryRepository.getCategory(searchCategory);
    }
    @Override
    public Book getIsbn(String isbn) {
        return libraryRepository.getIsbn(isbn);
    }
}
