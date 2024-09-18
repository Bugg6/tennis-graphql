package org.tehol.tennisstats;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String title, Integer pageCount, Integer authorId) {

    public static List<Book> books = Arrays.asList(
        new Book(1, "Harry Potter", 500, 1),
        new Book(2, "Toll the Hounds", 1200, 2),
        new Book(3, "Gardens of the Moon", 658, 2)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream().filter(book -> book.id.equals(id)).findFirst();
    }

}
