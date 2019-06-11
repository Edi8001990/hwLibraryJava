import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;


    @Before

    public void before(){
        book = new Book("The Lord of The Rings", "J.R.R Tolkien", "Fantasy");
    }

    @Test
    public void checkIfBookHasTitle(){
        assertEquals("The Lord of The Rings", book.getBookTitle());
    }

    @Test
    public void checkIfBookHasAuthor(){
        assertEquals("J.R.R Tolkien", book.getBookAuthor());
    }

    @Test
    public void checkIfBookHasGenre(){
        assertEquals("Fantasy", book.getBookGenre());
    }
}
