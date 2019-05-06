package booklibraryapplication.webapi;

import booklibraryapplication.webapi.repository.LibraryRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
        LibraryRepositoryImpl.readJson();
    }
}
