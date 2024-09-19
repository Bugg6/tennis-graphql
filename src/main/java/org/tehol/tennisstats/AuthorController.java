package org.tehol.tennisstats;

import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import java.util.Optional;

@Controller
public class AuthorController {

    @QueryMapping
    public Optional<Author> authorById(@Argument Integer id) {
        return Author.getAuthorById(id);
    }
}
