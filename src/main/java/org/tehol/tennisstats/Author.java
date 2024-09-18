package org.tehol.tennisstats;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public record Author(Integer id, String name) {

    public static List<Author> authors = Arrays.asList(
        new Author(1, "JK Rowling"),
        new Author(2, "Steven Erikson"),
        new Author(3, "Douglas Adams")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(author -> author.id.equals(id)).findFirst();
    }
}
