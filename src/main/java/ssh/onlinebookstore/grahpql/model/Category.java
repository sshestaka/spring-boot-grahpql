package ssh.onlinebookstore.grahpql.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Getter
@Setter
@ToString
@Table(name = "categories")
@Where(clause = "is_deleted = false")
@SQLDelete(sql = "UPDATE categories SET is_deleted = true WHERE id = ?")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private boolean isDeleted = false;
}
