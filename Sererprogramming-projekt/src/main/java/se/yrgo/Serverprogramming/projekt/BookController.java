package se.yrgo.Serverprogramming.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import se.yrgo.Serverprogramming.projekt.Book;
import se.yrgo.Serverprogramming.projekt.bookRespirotory;

@Controller
@RequestMapping("/website/books")
public class BookController {
    @Autowired
    private bookRespirotory data;

    // This method will save the book into the database
    @RequestMapping(value="/newBook.html", method=RequestMethod.POST)
    public String newBook(Book book) {
        data.save(book);
        return "redirect:/website/books/list.html";
    }

    // Presenting the initial form to the user
    @RequestMapping(value="/newBook.html", method=RequestMethod.GET)
    public ModelAndView renderNewBookForm() {
        return new ModelAndView("newBookForm");
    }

    // Responsible for listing all of the books
    @RequestMapping(value="/list.html", method=RequestMethod.GET)
    public ModelAndView books() {
        return new ModelAndView("bookList", "books", data.findAll());
    }

    // Search for a book by its title
    @RequestMapping(value="/book/{title}", method=RequestMethod.GET)
    public ModelAndView showBookByTitle(@PathVariable("title") String title) {
        Book book = data.findByTitle(title);
        return new ModelAndView("bookDetail", "book", book);
    }
}
