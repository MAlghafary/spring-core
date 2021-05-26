package mutaz.code.springcode;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public Book findBookById(String id){
        return new Book();
    }
}
