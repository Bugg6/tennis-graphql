package org.tehol.tennisstats;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String title, Integer pageCount) {

    public static List<Book> books = Arrays.asList(
        new Book(1, "Harry Potter", 500),
        new Book(2, "Toll the Hounds", 1200),
        new Book(3, "Gardens of the Moon", 658)
    );

}
