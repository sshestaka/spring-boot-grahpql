package ssh.onlinebookstore.grahpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ssh.onlinebookstore.grahpql.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
