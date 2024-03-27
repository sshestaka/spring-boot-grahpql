package ssh.onlinebookstore.grahpql.service;

import ssh.onlinebookstore.grahpql.model.Book;

import java.util.List;

public interface BookService {
    Book findDyId(Long id);
    List<Book> getAll();
    Book saveBook(Book book);
    Book updateBook(Book book);
}
