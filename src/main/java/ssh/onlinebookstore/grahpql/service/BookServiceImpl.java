package ssh.onlinebookstore.grahpql.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ssh.onlinebookstore.grahpql.model.Book;
import ssh.onlinebookstore.grahpql.model.Category;
import ssh.onlinebookstore.grahpql.repository.BookRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book findDyId(Long id) {
        return bookRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Can't find a book by id: " + id));
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        Book newBook = new Book();
        newBook.setTitle(book.getTitle());
        newBook.setAuthor(book.getAuthor());
        newBook.setIsbn(book.getIsbn());
        newBook.setDescription(book.getDescription());
        newBook.setPrice(book.getPrice());
        newBook.setCoverImage(book.getCoverImage());
        return bookRepository.save(newBook);
    }

    @Override
    public Book updateBook(Book book) {
        if (book != null && bookRepository.findById(book.getId()).isPresent()) {
            return bookRepository.save(book);
        }
        throw new NoSuchElementException("Can't find the book: " + book);
    }
}
