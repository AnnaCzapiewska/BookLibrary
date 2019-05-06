package booklibraryapplication.webapi.repository;

import booklibraryapplication.webapi.domain.Book;
import booklibraryapplication.webapi.domain.Library;
import booklibraryapplication.webapi.domain.VolumeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class LibraryRepositoryImpl implements LibraryRepository{

     private static Library library;

    public static void readJson(){
        ObjectMapper objectMapper = new ObjectMapper();
        ClassLoader classLoader = new LibraryRepositoryImpl().getClass().getClassLoader();
        File file = new File(classLoader.getResource("books.json").getFile());
        try {
            String jsonData = new String(Files.readAllBytes(file.toPath()));
            library = objectMapper.readValue(jsonData, Library.class);
        } catch (
                IOException e) {
            e.printStackTrace();
            library= null;
        }
    }

    public Library getAllBooks(){
        return library;
    }
    public List<Book> getCategory(String categories){
        return library.getItems().stream()
                .filter(book -> book.getVolumeInfo().getCategories() != null)
                .filter(book -> book.getVolumeInfo().getCategories()
                .stream()
                .anyMatch(category -> category.equalsIgnoreCase(categories)))
                .collect(Collectors.toList());
    }
    public Book getIsbn(String isbn){
                Optional<Book> optionalBook = library.getItems().stream()
                .filter(book -> book.getVolumeInfo().getIndustryIdentifiers()!=null)
                .filter(book -> book.getVolumeInfo().getIndustryIdentifiers()
                .stream()
                        .filter(identifiers -> identifiers.getIdentifier()!=null)
                .anyMatch(identifiers -> identifiers.getIdentifier().equalsIgnoreCase(isbn)))
                .findFirst();
                return optionalBook.orElse(null);
    }
   /* public Map<String,Double> getAuthorAndRating( double ratingMap){
        return library.getItems().stream()
                .filter(book -> book.getVolumeInfo().getAuthors() != null)

                .filter(book -> book.getVolumeInfo().getAverageRating() >0.0)

                .collect(Collectors.toMap(Book-> {
                    return (VolumeInfo::getAuthors, VolumeInfo::getAverageRating }));
    }*/

}
