package org.tehol.tennisstats;

import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import java.util.List;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }
}
