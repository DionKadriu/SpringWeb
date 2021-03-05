package guru.springframework.springSwebapp.repositories;

import guru.springframework.springSwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
