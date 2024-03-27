package ssh.onlinebookstore.grahpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ssh.onlinebookstore.grahpql.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
