package se.yrgo.Serverprogramming.projekt;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookRestController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/books")
    public bookList allBooks() {
        List<Book> all = bookRepository.findAll();
        return new bookList(all);
    }

    @RequestMapping(value= "/books", method=RequestMethod.POST)
    public ResponseEntity<Book> createANewBook(@RequestBody Book book) {
        bookRepository.save(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
