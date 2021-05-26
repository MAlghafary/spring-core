package mutaz.code.springcode;

import org.springframework.stereotype.Service;

public class BookService {

    private BookRepository bookRepository;
    private MailService mailService;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void setMailService(MailService mailService){
        this.mailService = mailService;
    }
}
