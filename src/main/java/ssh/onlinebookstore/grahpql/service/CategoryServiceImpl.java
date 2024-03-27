package ssh.onlinebookstore.grahpql.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ssh.onlinebookstore.grahpql.model.Category;
import ssh.onlinebookstore.grahpql.repository.CategoryRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Can't find the category by id: " + id));
    }
}
