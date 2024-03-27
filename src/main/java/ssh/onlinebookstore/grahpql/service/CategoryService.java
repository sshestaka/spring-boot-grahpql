package ssh.onlinebookstore.grahpql.service;

import ssh.onlinebookstore.grahpql.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category getById(Long id);
}
