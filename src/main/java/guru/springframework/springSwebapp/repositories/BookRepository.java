package guru.springframework.springSwebapp.repositories;

import guru.springframework.springSwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
