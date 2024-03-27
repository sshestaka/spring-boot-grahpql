package ssh.onlinebookstore.grahpql.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ssh.onlinebookstore.grahpql.model.Book;
import ssh.onlinebookstore.grahpql.service.BookService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @QueryMapping
    public List<Book> allBooks() {
        return bookService.getAll();
    }

    @QueryMapping
    public Book findById(@Argument Long id) {
        return  bookService.findDyId(id);
    }

    @MutationMapping
    public Book saveBook(@Argument(value = "bookInput") Book book) {
        return bookService.saveBook(book);
    }

    @MutationMapping
    public Book updateBook(@Argument(value = "bookUpdate") Book book) {
        return bookService.updateBook(book);
    }
}
