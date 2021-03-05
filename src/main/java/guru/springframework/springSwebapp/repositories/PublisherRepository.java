package guru.springframework.springSwebapp.repositories;

import guru.springframework.springSwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
