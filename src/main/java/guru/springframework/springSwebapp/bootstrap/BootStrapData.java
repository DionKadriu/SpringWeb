package guru.springframework.springSwebapp.bootstrap;

import guru.springframework.springSwebapp.domain.Author;
import guru.springframework.springSwebapp.domain.Book;
import guru.springframework.springSwebapp.domain.Publisher;
import guru.springframework.springSwebapp.repositories.AuthorRepository;
import guru.springframework.springSwebapp.repositories.BookRepository;
import guru.springframework.springSwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Spring manage component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "43241312314");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Publisher mark= new Publisher("Mark","Brooklyn","Prishtina","Kosovo","10000");

        publisherRepository.save(mark);


        System.out.println("Started in Bootstrap");
        System.out.println("The number of publishers "+ publisherRepository.count());
        System.out.println("Number of books is:" + bookRepository.count());
    }
}
